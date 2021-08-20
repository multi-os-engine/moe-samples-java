package org.moe.samples.simplechart.charts.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class ChartLegendForm {
    @Generated
    private ChartLegendForm() {
    }

    /**
     * Avoid drawing a form
     */
    @Generated
    public static final long None = 0x0000000000000000L;
    /**
     * Do not draw the a form, but leave space for it
     */
    @Generated
    public static final long Empty = 0x0000000000000001L;
    /**
     * Use default (default dataset’s form to the legend’s form)
     */
    @Generated
    public static final long Default = 0x0000000000000002L;
    /**
     * Draw a square
     */
    @Generated
    public static final long Square = 0x0000000000000003L;
    /**
     * Draw a circle
     */
    @Generated
    public static final long Circle = 0x0000000000000004L;
    /**
     * Draw a horizontal line
     */
    @Generated
    public static final long Line = 0x0000000000000005L;
}