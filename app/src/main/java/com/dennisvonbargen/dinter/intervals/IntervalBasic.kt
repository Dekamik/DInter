package com.dennisvonbargen.dinter.intervals

data class IntervalBasic(val type: IntervalType, override var name: String, override var timeMillis: Long) : Interval() {
    constructor(type: IntervalType, timeMillis: Long): this(type, type.name, timeMillis)
}
