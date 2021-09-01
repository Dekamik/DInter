package com.dennisvonbargen.dinter.intervals

class IntervalScheduleListFactory {
    fun create(): ArrayList<IntervalSchedule> {
        return arrayListOf(
            IntervalSchedule(
                "30/30",
                arrayListOf(
                    IntervalBasic(IntervalType.Low, 30000L),
                    IntervalBasic(IntervalType.High, 30000L)
                ),
                15,
                IntervalPrePost(IntervalPrePostType.Warmup, 300000L),
                IntervalPrePost(IntervalPrePostType.CoolDown, 120000L)
            ),
            IntervalSchedule(
                "30/30/30",
                arrayListOf(
                    IntervalBasic(IntervalType.Rest, 30000L),
                    IntervalBasic(IntervalType.Low, 30000L),
                    IntervalBasic(IntervalType.High, 30000L)
                ),
                15,
                IntervalPrePost(IntervalPrePostType.Warmup, 480000L),
                IntervalPrePost(IntervalPrePostType.CoolDown, 300000L)
            ),
            IntervalSchedule(
                "Norwegian intervals",
                arrayListOf(
                    IntervalBasic(IntervalType.High, "90-95% max pulse", 240000L),
                    IntervalBasic(IntervalType.Low, "70% max pulse", 240000L)
                ),
                4,
                IntervalPrePost(IntervalPrePostType.Warmup, 720000L),
                IntervalPrePost(IntervalPrePostType.CoolDown, 900000L)
            )
        )
    }
}