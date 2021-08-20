package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import apple.uikit.UIFont;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.IChartDataSet;
import org.moe.samples.simplechart.charts.protocol.IChartValueFormatter;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts9ChartData")
@ObjCClassBinding
public class ChartData extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * When the data entry labels are generated identifiers, set this property to prepend a string before each identifier
     * For example, if a label is “#3”, settings this property to “Item” allows it to be spoken as “Item #3”
     */
    @Generated
    @Selector("accessibilityEntryLabelPrefix")
    public native String accessibilityEntryLabelPrefix();

    /**
     * When the data entry value requires a unit, use this property to append the string representation of the unit to the value
     * For example, if a value is “44.1”, setting this property to “m” allows it to be spoken as “44.1 m”
     */
    @Generated
    @Selector("accessibilityEntryLabelSuffix")
    public native String accessibilityEntryLabelSuffix();

    /**
     * If the data entry value is a count, set this to true to allow plurals and other grammatical changes
     * <em>default</em>: false
     */
    @Generated
    @Selector("accessibilityEntryLabelSuffixIsCount")
    public native boolean accessibilityEntryLabelSuffixIsCount();

    @Generated
    @Selector("addDataSet:")
    public native void addDataSet(@Mapped(ObjCObjectMapper.class) IChartDataSet dataSet);

    /**
     * Adds an Entry to the DataSet at the specified index. Entries are added to the end of the list.
     */
    @Generated
    @Selector("addEntry:dataSetIndex:")
    public native void addEntryDataSetIndex(ChartDataEntry e, @NInt long dataSetIndex);

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartData alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * calc minimum and maximum y value over all datasets
     */
    @Generated
    @Selector("calcMinMax")
    public native void calcMinMax();

    /**
     * Adjusts the minimum and maximum values based on the given DataSet.
     */
    @Generated
    @Selector("calcMinMaxWithDataSet:")
    public native void calcMinMaxWithDataSet(@Mapped(ObjCObjectMapper.class) IChartDataSet d);

    /**
     * Adjusts the current minimum and maximum values based on the provided Entry object.
     */
    @Generated
    @Selector("calcMinMaxWithEntry:axis:")
    public native void calcMinMaxWithEntryAxis(ChartDataEntry e, @NInt long axis);

    @Generated
    @Selector("calcMinMaxYFromX:toX:")
    public native void calcMinMaxYFromXToX(double fromX, double toX);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Clears this data object from all DataSets and removes all Entries.
     * Don’t forget to invalidate the chart after this.
     */
    @Generated
    @Selector("clearValues")
    public native void clearValues();

    /**
     * Checks if this data object contains the specified DataSet.
     * 
     * returns:
     * <code>true</code> if so, <code>false</code> ifnot.
     */
    @Generated
    @Selector("containsWithDataSet:")
    public native boolean containsWithDataSet(@Mapped(ObjCObjectMapper.class) IChartDataSet dataSet);

    /**
     * The number of LineDataSets this object contains
     */
    @Generated
    @Selector("dataSetCount")
    @NInt
    public native long dataSetCount();

    /**
     * All DataSet objects this ChartData object holds.
     */
    @Generated
    @Selector("dataSets")
    public native NSArray<?> dataSets();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The total entry count across all DataSet objects this data object contains.
     */
    @Generated
    @Selector("entryCount")
    @NInt
    public native long entryCount();

    /**
     * Get the Entry for a corresponding highlight object
     * \param highlight
     * 
     * 
     * returns:
     * The entry that is highlighted
     */
    @Generated
    @Selector("entryForHighlight:")
    public native ChartDataEntry entryForHighlight(ChartHighlight highlight);

    /**
     * returns:
     * All colors used across all DataSet objects this object represents.
     */
    @Generated
    @Selector("getColors")
    public native NSArray<? extends UIColor> getColors();

    @Generated
    @Selector("getDataSetByIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native IChartDataSet getDataSetByIndex(@NInt long index);

    /**
     * <em>IMPORTANT: This method does calculations at runtime. Use with care in performance critical situations.</em>
     * \param label
     * 
     * \param ignorecase
     * 
     * 
     * returns:
     * The DataSet Object with the given label. Sensitive or not.
     */
    @Generated
    @Selector("getDataSetByLabel:ignorecase:")
    @MappedReturn(ObjCObjectMapper.class)
    public native IChartDataSet getDataSetByLabelIgnorecase(String label, boolean ignorecase);

    /**
     * returns:
     * The DataSet that contains the provided Entry, or null, if no DataSet contains this entry.
     */
    @Generated
    @Selector("getDataSetForEntry:")
    @MappedReturn(ObjCObjectMapper.class)
    public native IChartDataSet getDataSetForEntry(ChartDataEntry e);

    /**
     * returns:
     * The first DataSet from the datasets-array that has it’s dependency on the left axis. Returns null if no DataSet with left dependency could be found.
     */
    @Generated
    @Selector("getFirstLeftWithDataSets:")
    @MappedReturn(ObjCObjectMapper.class)
    public native IChartDataSet getFirstLeftWithDataSets(NSArray<?> dataSets);

    /**
     * returns:
     * The first DataSet from the datasets-array that has it’s dependency on the right axis. Returns null if no DataSet with right dependency could be found.
     */
    @Generated
    @Selector("getFirstRightWithDataSets:")
    @MappedReturn(ObjCObjectMapper.class)
    public native IChartDataSet getFirstRightWithDataSets(NSArray<?> dataSets);

    @Generated
    @Selector("getYMaxWithAxis:")
    public native double getYMaxWithAxis(@NInt long axis);

    @Generated
    @Selector("getYMinWithAxis:")
    public native double getYMinWithAxis(@NInt long axis);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Enables / disables highlighting values for all DataSets this data object contains.
     * If set to true, this means that values can be highlighted programmatically or by touch gesture.
     */
    @Generated
    @Selector("highlightEnabled")
    public native boolean highlightEnabled();

    /**
     * returns:
     * The index of the provided DataSet in the DataSet array of this data object, or -1 if it does not exist.
     */
    @Generated
    @Selector("indexOfDataSet:")
    @NInt
    public native long indexOfDataSet(@Mapped(ObjCObjectMapper.class) IChartDataSet dataSet);

    @Generated
    @Selector("init")
    public native ChartData init();

    @Generated
    @Selector("initWithDataSet:")
    public native ChartData initWithDataSet(@Mapped(ObjCObjectMapper.class) IChartDataSet dataSet);

    @Generated
    @Selector("initWithDataSets:")
    public native ChartData initWithDataSets(NSArray<?> dataSets);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * if true, value highlightning is enabled
     */
    @Generated
    @Selector("isHighlightEnabled")
    public native boolean isHighlightEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * The DataSet object with the maximum number of entries or null if there are no DataSets.
     */
    @Generated
    @Selector("maxEntryCountSet")
    @MappedReturn(ObjCObjectMapper.class)
    public native IChartDataSet maxEntryCountSet();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Call this method to let the ChartData know that the underlying data has changed.
     * Calling this performs all necessary recalculations needed when the contained data has changed.
     */
    @Generated
    @Selector("notifyDataChanged")
    public native void notifyDataChanged();

    /**
     * Removes the given DataSet from this data object.
     * Also recalculates all minimum and maximum values.
     * 
     * returns:
     * <code>true</code> if a DataSet was removed, <code>false</code> ifno DataSet could be removed.
     */
    @Generated
    @Selector("removeDataSet:")
    public native boolean removeDataSet(@Mapped(ObjCObjectMapper.class) IChartDataSet dataSet);

    /**
     * Removes the DataSet at the given index in the DataSet array from the data object.
     * Also recalculates all minimum and maximum values.
     * 
     * returns:
     * <code>true</code> if a DataSet was removed, <code>false</code> ifno DataSet could be removed.
     */
    @Generated
    @Selector("removeDataSetByIndex:")
    public native boolean removeDataSetByIndex(@NInt long index);

    /**
     * Removes the given Entry object from the DataSet at the specified index.
     */
    @Generated
    @Selector("removeEntry:dataSetIndex:")
    public native boolean removeEntryDataSetIndex(ChartDataEntry entry, @NInt long dataSetIndex);

    /**
     * Removes the Entry object closest to the given xIndex from the ChartDataSet at the
     * specified index.
     * 
     * returns:
     * <code>true</code> if an entry was removed, <code>false</code> ifno Entry was found that meets the specified requirements.
     */
    @Generated
    @Selector("removeEntryWithXValue:dataSetIndex:")
    public native boolean removeEntryWithXValueDataSetIndex(double xValue, @NInt long dataSetIndex);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * When the data entry labels are generated identifiers, set this property to prepend a string before each identifier
     * For example, if a label is “#3”, settings this property to “Item” allows it to be spoken as “Item #3”
     */
    @Generated
    @Selector("setAccessibilityEntryLabelPrefix:")
    public native void setAccessibilityEntryLabelPrefix(String value);

    /**
     * When the data entry value requires a unit, use this property to append the string representation of the unit to the value
     * For example, if a value is “44.1”, setting this property to “m” allows it to be spoken as “44.1 m”
     */
    @Generated
    @Selector("setAccessibilityEntryLabelSuffix:")
    public native void setAccessibilityEntryLabelSuffix(String value);

    /**
     * If the data entry value is a count, set this to true to allow plurals and other grammatical changes
     * <em>default</em>: false
     */
    @Generated
    @Selector("setAccessibilityEntryLabelSuffixIsCount:")
    public native void setAccessibilityEntryLabelSuffixIsCount(boolean value);

    /**
     * All DataSet objects this ChartData object holds.
     */
    @Generated
    @Selector("setDataSets:")
    public native void setDataSets(NSArray<?> value);

    /**
     * Enables / disables drawing values (value-text) for all DataSets this data object contains.
     */
    @Generated
    @Selector("setDrawValues:")
    public native void setDrawValues(boolean enabled);

    /**
     * Enables / disables highlighting values for all DataSets this data object contains.
     * If set to true, this means that values can be highlighted programmatically or by touch gesture.
     */
    @Generated
    @Selector("setHighlightEnabled:")
    public native void setHighlightEnabled(boolean value);

    /**
     * Sets the font for all value-labels for all DataSets this data object contains.
     */
    @Generated
    @Selector("setValueFont:")
    public native void setValueFont(UIFont font);

    /**
     * Sets a custom IValueFormatter for all DataSets this data object contains.
     */
    @Generated
    @Selector("setValueFormatter:")
    public native void setValueFormatter(@Mapped(ObjCObjectMapper.class) IChartValueFormatter formatter);

    /**
     * Sets the color of the value-text (color in which the value-labels are drawn) for all DataSets this data object contains.
     */
    @Generated
    @Selector("setValueTextColor:")
    public native void setValueTextColor(UIColor color);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The maximum x-value the data object contains.
     */
    @Generated
    @Selector("xMax")
    public native double xMax();

    /**
     * The minimum x-value the data object contains.
     */
    @Generated
    @Selector("xMin")
    public native double xMin();

    /**
     * The greatest y-value the data object contains.
     */
    @Generated
    @Selector("yMax")
    public native double yMax();

    /**
     * The smallest y-value the data object contains.
     */
    @Generated
    @Selector("yMin")
    public native double yMin();
}