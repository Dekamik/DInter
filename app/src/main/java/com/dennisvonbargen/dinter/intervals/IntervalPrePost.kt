package com.dennisvonbargen.dinter.intervals

data class IntervalPrePost(val type: IntervalPrePostType, override var name: String, override var timeMillis: Long) : Interval() {
    constructor(type: IntervalPrePostType, timeMillis: Long) : this(type, type.name, timeMillis)
}
