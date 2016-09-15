package org.moe.samples.rssreader.ios;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import apple.coregraphics.struct.CGRect;
import apple.uikit.UILabel;
import apple.uikit.UITableViewCell;
import apple.uikit.UITextView;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassName("RSSCell")
@RegisterOnStartup
public class RSSCell extends UITableViewCell {

	@Generated
	protected RSSCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native RSSCell alloc();

	@Generated
	@Selector("init")
	public native RSSCell init();

	@Generated
	@Property
	@Selector("rssDate")
	public native UILabel rssDate();

	@Generated
	@Property
	@Selector("rssDescription")
	public native UITextView rssDescription();

	@Generated
	@Property
	@Selector("rssTitle")
	public native UILabel rssTitle();

	@Generated
	@Property
	@Selector("setRssDate:")
	public native void setRssDate(UILabel value);

	@Generated
	@Property
	@Selector("setRssDescription:")
	public native void setRssDescription(UITextView value);

	@Generated
	@Property
	@Selector("setRssTitle:")
	public native void setRssTitle(UILabel value);
}