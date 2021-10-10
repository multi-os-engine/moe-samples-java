package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.ChartAnimator;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ChartAnimatorDelegate")
public interface ChartAnimatorDelegate {
    /**
     * Called when the Animator has stopped.
     */
    @Generated
    @Selector("animatorStopped:")
    void animatorStopped(ChartAnimator animator);

    /**
     * Called when the Animator has stepped.
     */
    @Generated
    @Selector("animatorUpdated:")
    void animatorUpdated(ChartAnimator animator);
}