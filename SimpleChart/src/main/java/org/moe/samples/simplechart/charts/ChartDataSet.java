package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

/**
 * The DataSet class represents one group or type of entries (Entry) in the Chart that belong together.
 * It is designed to logically separate different groups of values inside the Chart (e.g. the values for a specific line in the LineChart, or the values of a specific group of bars in the BarChart).
 */
@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts12ChartDataSet")
@ObjCClassBinding
public class ChartDataSet extends ChartBaseDataSet {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartDataSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Adds an Entry to the DataSet dynamically.
     * Entries are added to the end of the list.
     * This will also recalculate the current minimum and maximum values of the DataSet and the value-sum.
     * \param e the entry to add
     * 
     * 
     * returns:
     * True
     */
    @Generated
    @Deprecated
    @Selector("addEntry:")
    public native boolean addEntry(ChartDataEntry e);

    /**
     * Adds an Entry to the DataSet dynamically.
     * Entries are added to their appropriate index respective to it’s x-index.
     * This will also recalculate the current minimum and maximum values of the DataSet and the value-sum.
     * \param e the entry to add
     * 
     * 
     * returns:
     * True
     */
    @Generated
    @Selector("addEntryOrdered:")
    public native boolean addEntryOrdered(ChartDataEntry e);

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartDataSet alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("calcMinMax")
    public native void calcMinMax();

    @Generated
    @Selector("calcMinMaxXWithEntry:")
    public native void calcMinMaxXWithEntry(ChartDataEntry e);

    @Generated
    @Selector("calcMinMaxYFromX:toX:")
    public native void calcMinMaxYFromXToX(double fromX, double toX);

    @Generated
    @Selector("calcMinMaxYWithEntry:")
    public native void calcMinMaxYWithEntry(ChartDataEntry e);

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
     * Removes all values from this DataSet and recalculates min and max value.
     */
    @Generated
    @Deprecated
    @Selector("clear")
    public native void clear();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("entries")
    public native NSArray<? extends ChartDataEntry> entries();

    /**
     * returns:
     * All Entry objects found at the given xIndex with binary search.
     * An empty array if no Entry object at that index.
     */
    @Generated
    @Selector("entriesForXValue:")
    public native NSArray<? extends ChartDataEntry> entriesForXValue(double xValue);

    /**
     * The number of y-values this DataSet represents
     */
    @Generated
    @Deprecated
    @Selector("entryCount")
    @NInt
    public native long entryCount();

    /**
     * throws:
     * out of bounds
     * if <code>i</code> is out of bounds, it may throw an out-of-bounds exception
     * 
     * returns:
     * The entry object found at the given index (not x-value!)
     */
    @Generated
    @Deprecated
    @Selector("entryForIndex:")
    public native ChartDataEntry entryForIndex(@NInt long i);

    /**
     * \param xValue the x-value
     * 
     * \param closestToY If there are multiple y-values for the specified x-value,
     * 
     * 
     * returns:
     * The first Entry object found at the given x-value with binary search.
     * If the no Entry at the specified x-value is found, this method returns the Entry at the closest x-value.
     * nil if no Entry object at that x-value.
     */
    @Generated
    @Selector("entryForXValue:closestToY:")
    public native ChartDataEntry entryForXValueClosestToY(double xValue, double yValue);

    /**
     * \param xValue the x-value
     * 
     * \param closestToY If there are multiple y-values for the specified x-value,
     * 
     * \param rounding determine whether to round up/down/closest if there is no Entry matching the provided x-value
     * 
     * 
     * returns:
     * The first Entry object found at the given x-value with binary search.
     * If the no Entry at the specified x-value is found, this method returns the Entry at the closest x-value according to the rounding.
     * nil if no Entry object at that x-value.
     */
    @Generated
    @Selector("entryForXValue:closestToY:rounding:")
    public native ChartDataEntry entryForXValueClosestToYRounding(double xValue, double yValue, @NInt long rounding);

    /**
     * \param e the entry to search for
     * 
     * 
     * returns:
     * The array-index of the specified entry
     */
    @Generated
    @Deprecated
    @Selector("entryIndexWithEntry:")
    @NInt
    public native long entryIndexWithEntry(ChartDataEntry e);

    /**
     * \param xValue x-value of the entry to search for
     * 
     * \param closestToY If there are multiple y-values for the specified x-value,
     * 
     * \param rounding Rounding method if exact value was not found
     * 
     * 
     * returns:
     * The array-index of the specified entry.
     * If the no Entry at the specified x-value is found, this method returns the index of the Entry at the closest x-value according to the rounding.
     */
    @Generated
    @Selector("entryIndexWithX:closestToY:rounding:")
    @NInt
    public native long entryIndexWithXClosestToYRounding(double xValue, double yValue, @NInt long rounding);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ChartDataSet init();

    @Generated
    @Selector("initWithEntries:")
    public native ChartDataSet initWithEntries(NSArray<? extends ChartDataEntry> entries);

    @Generated
    @Selector("initWithEntries:label:")
    public native ChartDataSet initWithEntriesLabel(NSArray<? extends ChartDataEntry> entries, String label);

    @Generated
    @Selector("initWithLabel:")
    public native ChartDataSet initWithLabel(String label);

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

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native ChartDataEntry objectAtIndexedSubscript(long position);

    @Generated
    @Selector("removeAllWithKeepingCapacity:")
    public native void removeAllWithKeepingCapacity(boolean keepCapacity);

    @Generated
    @Selector("removeEntry:")
    public native boolean removeEntry(ChartDataEntry entry);

    /**
     * Removes the first Entry (at index 0) of this DataSet from the entries array.
     * 
     * returns:
     * <code>true</code> if successful, <code>false</code> if not.
     */
    @Generated
    @Deprecated
    @Selector("removeFirst")
    public native boolean removeFirst();

    /**
     * Removes the last Entry (at index size-1) of this DataSet from the entries array.
     * 
     * returns:
     * <code>true</code> if successful, <code>false</code> if not.
     */
    @Generated
    @Deprecated
    @Selector("removeLast")
    public native boolean removeLast();

    /**
     * Used to replace all entries of a data set while retaining styling properties.
     * This is a separate method from a setter on <code>entries</code> to encourage usage
     * of <code>Collection</code> conformances.
     * \param entries new entries to replace existing entries in the dataset
     */
    @Generated
    @Selector("replaceEntries:")
    public native void replaceEntries(NSArray<? extends ChartDataEntry> entries);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setObject:atIndexedSubscript:")
    public native void setObjectAtIndexedSubscript(ChartDataEntry newValue, long position);

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
     * The maximum x-value this DataSet holds
     */
    @Generated
    @Selector("xMax")
    public native double xMax();

    /**
     * The minimum x-value this DataSet holds
     */
    @Generated
    @Selector("xMin")
    public native double xMin();

    /**
     * The maximum y-value this DataSet holds
     */
    @Generated
    @Selector("yMax")
    public native double yMax();

    /**
     * The minimum y-value this DataSet holds
     */
    @Generated
    @Selector("yMin")
    public native double yMin();
}