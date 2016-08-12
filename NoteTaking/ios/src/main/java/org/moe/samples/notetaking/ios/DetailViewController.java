package org.moe.samples.notetaking.ios;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.notetaking.common.Data;

import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.uikit.UITextView;
import ios.uikit.UIViewController;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("DetailViewController")
@RegisterOnStartup
public class DetailViewController extends UIViewController {
    static {
        NatJ.register();
    }

    public Data data;
    private String detailItem = "";
    private UITextView dataText;

    protected DetailViewController(Pointer peer) {
        super(peer);
    }

    public static native DetailViewController alloc();

    @Override
    public native DetailViewController init();

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        dataText = noteView();
        // Do any additional setup after loading the view, typically from a nib.

        configureView();
    }

    public void configureView() {
        // Update the user interface for the detail item.
        if(data != null) {
            String currentNote = data.getAllNotes().get(detailItem);
            if (!currentNote.equals("New Note")) {
                dataText.setText(currentNote);
            } else {
                dataText.setText("");
            }
        }
        noteView().becomeFirstResponder();

    }

    public void setDetailItem(String newDetailItem, Data d) {
        if (!detailItem.equals(newDetailItem)) {
            detailItem = newDetailItem;
            data = d;
            data.setCurrentKey(newDetailItem);
        }
    }

    public String getDetailItem() {
        return detailItem;
    }

    @Generated
    public native DetailViewController initWithNibNameBundle(
            String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    public native DetailViewController initWithCoder(NSCoder aDecoder);

    @Generated
    @Property
    @Selector("noteView")
    public native UITextView noteView();

    @Generated
    @Selector("setNoteView:")
    public native void setNoteView_unsafe(UITextView value);

    @Generated
    public void setNoteView(UITextView value) {
        org.moe.natj.objc.ObjCObject __old = (org.moe.natj.objc.ObjCObject) noteView();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
                    value);
        }
        setNoteView_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
                    __old);
        }
    }

    @Selector("doSaveNote:")
    public void doSaveNote( Object sender){
        if(data != null) {
            if (!dataText.text().isEmpty()) {
                data.setNoteForCurrentKey(dataText.text());
            } else {
                data.removeCurrentNote();
            }
        }
    }
}
