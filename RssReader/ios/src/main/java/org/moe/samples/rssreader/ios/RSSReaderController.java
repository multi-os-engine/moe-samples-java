// Copyright (c) 2015, Intel Corporation
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
// 1. Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
// 3. Neither the name of the copyright holder nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package org.moe.samples.rssreader.ios;

import org.moe.natj.general.Pointer;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.rssreader.common.Bookmarks;
import org.moe.samples.rssreader.common.RSSFeed;
import org.moe.samples.rssreader.common.RSSFeedItem;

import apple.c.Globals;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSBundle;
import apple.foundation.NSDictionary;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSString;
import apple.foundation.NSURL;
import apple.foundation.struct.NSRange;
import apple.uikit.NSMutableParagraphStyle;
import apple.uikit.NSTextStorage;
import apple.uikit.UIAlertView;
import apple.uikit.UIApplication;
import apple.uikit.UIBarButtonItem;
import apple.uikit.UIDevice;
import apple.uikit.UIFont;
import apple.uikit.UINib;
import apple.uikit.UIPopoverController;
import apple.uikit.UITableView;
import apple.uikit.UITableViewCell;
import apple.uikit.c.UIKit;
import apple.uikit.enums.NSLineBreakMode;
import apple.uikit.enums.NSStringDrawingOptions;
import apple.uikit.enums.UIBarButtonItemStyle;
import apple.uikit.enums.UIPopoverArrowDirection;
import apple.uikit.enums.UIUserInterfaceIdiom;
import apple.uikit.struct.UIEdgeInsets;

public class RSSReaderController extends CustomCellTableController {

    private static final double textViewHPadding;
    private static final double textViewVPadding;
    private static final long textViewDrawingOptions;
    private static final NSDictionary textViewAttributes;

    private Thread loaderThread = null;

    static {
        // Some consts
        final UIEdgeInsets textContainerInsets = new UIEdgeInsets(8.0, 0.0, 8.0, 0.0);
        final UIEdgeInsets contentInsets = new UIEdgeInsets(0.0, 0.0, 0.0, 0.0);
        final double lineFragmentPadding = 5.0;

        // Calculate paddings
        textViewHPadding = textContainerInsets.left() + textContainerInsets.right() + 2.0 *
                lineFragmentPadding + contentInsets.left() + contentInsets.right();
        textViewVPadding = textContainerInsets.top() + textContainerInsets.bottom() +
                contentInsets.top() + contentInsets.bottom();

        // Set options
        textViewDrawingOptions = NSStringDrawingOptions.UsesLineFragmentOrigin |
                NSStringDrawingOptions.UsesFontLeading;

        NSMutableParagraphStyle paragraphStyle = NSMutableParagraphStyle.alloc().init();
        paragraphStyle.setLineBreakMode(NSLineBreakMode.WordWrapping);

        NSTextStorage textStorage = NSTextStorage.alloc().initWithString("-");
        NSDictionary textStorageAttrs = textStorage.attributesAtIndexEffectiveRange(0, new
                NSRange(0, 1));
        UIFont font = (UIFont) textStorageAttrs.get(UIKit.NSFontAttributeName());

        NSMutableDictionary attributes = NSMutableDictionary.dictionaryWithCapacity(2);
        attributes.put(UIKit.NSFontAttributeName(), font);
        attributes.put(UIKit.NSParagraphStyleAttributeName(), paragraphStyle);
        textViewAttributes = attributes;
    }

    public static native RSSReaderController alloc();

    protected RSSReaderController(Pointer peer) {
        super(peer);
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        setTitle("RSS Reader");

        UIBarButtonItem bmbutton = UIBarButtonItem.alloc().initWithTitleStyleTargetAction
                ("Bookmarks", UIBarButtonItemStyle.Plain, this, new SEL("showBookmarks"));
        navigationItem().setRightBarButtonItem(bmbutton);

        loadURL(Bookmarks.bookmarks[0]);
    }

    @Override
    protected void prepareController() {
        UINib nib = UINib.nibWithNibNameBundle("RSSCell", NSBundle.mainBundle());
        tableView().registerNibForCellReuseIdentifier(nib, CELL_IDENTIFIER);
    }

    private void loadURL(final String url) {
        if (loaderThread != null) {
            return;
        }

        loaderThread = new Thread(() -> {
            final RSSFeed feed = new RSSFeed(url);
            if (feed.getLastErrorMessage().length() != 0) {
                handleError(feed.getLastErrorMessage());
                return;
            }

            Globals.dispatch_sync(Globals.dispatch_get_main_queue(), () -> {
                getOptions().clear();
                for (RSSFeedItem item : feed.getItems()) {
                    add(item);
                }
                System.out.println("Finished loading url " + url);
                tableView().reloadData();
                tableView().scrollRectToVisibleAnimated(CoreGraphics.CGRectMake(0.0, 0.0, 1.0,
                        1.0), true);
                loaderThread = null;
            });
        });
        loaderThread.start();
    }

    private void handleError(String errorMessage) {
        Globals.dispatch_async(Globals.dispatch_get_main_queue(), () -> {
            UIAlertView alertView = UIAlertView.alloc().init();
            alertView.setMessage("Cannot Show Rss news: " + errorMessage);
            alertView.show();
        });
    }

    @Override
    protected void setupCellAtIndex(UITableViewCell cell, Object rowData) {
        RSSCell c = (RSSCell) cell;
        RSSFeedItem i = (RSSFeedItem) rowData;

        c.rssTitle().setText(i.getTitle());
        c.rssDescription().setText(i.getDescription());
        c.rssDate().setText(i.getPubDate());
    }

    @Selector("showBookmarks")
    public void showBookmarks() {
        SimpleTableController bms = SimpleTableController.alloc().init();
        bms.setTitle("Bookmarks");
        for (String bm : Bookmarks.bookmarks) {
            bms.add(bm);
        }
        if (UIDevice.currentDevice().userInterfaceIdiom() == UIUserInterfaceIdiom.Phone) {
            bms.setListener((tableView, row) -> {
                loadURL(row);
                navigationController().popViewControllerAnimated(true);
            });
            navigationController().pushViewControllerAnimated(bms, true);
        } else {
            final UIPopoverController ctrl = UIPopoverController.alloc()
                    .initWithContentViewController(bms);
            bms.setListener((tableView, row) -> {
                loadURL(row);
                ctrl.dismissPopoverAnimated(true);
            });
            ctrl.presentPopoverFromBarButtonItemPermittedArrowDirectionsAnimated(navigationItem()
                    .rightBarButtonItem(), UIPopoverArrowDirection.Any, true);
        }
    }

    @Override
    public double tableViewHeightForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        RSSFeedItem item = (RSSFeedItem) getOptions().get((int) indexPath.row());
        String ttm = item.getDescription();
        if (ttm.endsWith("\n")) {
            ttm += "-";
        }
        NSString measure = NSString.stringWithString(ttm);

        // Width: 2 * 10 pixel margin + 5 pixel padding
        CGSize size = new CGSize(tableView.bounds().size().width() - 10.0 * 2.0 -
                textViewHPadding, 1000.0);
        CGRect bounding = measure.boundingRectWithSizeOptionsAttributesContext(size,
                textViewDrawingOptions, textViewAttributes, null);

        return Math.ceil(bounding.size().height() + textViewVPadding + 1.0) + 39.0 + 34.0;
    }

    @Override
    public void tableViewDidSelectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath) {
        RSSFeedItem item = (RSSFeedItem) getOptions().get((int) indexPath.row());
        String url = item.getUrl();
        if (url != null) {
            UIApplication.sharedApplication().openURL(NSURL.URLWithString(url));
        }
    }
}
