package com.dennisvonbargen.dinter.intervals

data class IntervalSchedule(val name: String, val intervals: ArrayList<Interval>, val intervalRepetitions: Int, val warmup: IntervalPrePost, val coolDown: IntervalPrePost)
