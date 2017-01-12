package org.moe.samples.rssreader.ios;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IBOutlet;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import apple.uikit.UILabel;
import apple.uikit.UITableViewCell;
import apple.uikit.UITextView;

@Runtime(ObjCRuntime.class)
@ObjCClassName("RSSCell")
@RegisterOnStartup
public class RSSCell extends UITableViewCell {

    protected RSSCell(Pointer peer) {
        super(peer);
    }

    @Owned
    @Selector("alloc")
    public static native RSSCell alloc();

    @Selector("init")
    public native RSSCell init();

    @IBOutlet
    @Property
    @Selector("rssDate")
    public native UILabel rssDate();

    @IBOutlet
    @Property
    @Selector("rssDescription")
    public native UITextView rssDescription();

    @IBOutlet
    @Property
    @Selector("rssTitle")
    public native UILabel rssTitle();

    @Selector("setRssDate:")
    public native void setRssDate(UILabel value);

    @Selector("setRssDescription:")
    public native void setRssDescription(UITextView value);

    @Selector("setRssTitle:")
    public native void setRssTitle(UILabel value);
}
