package _05_extensions

import kotlin.math.abs
import kotlin.math.absoluteValue

fun Int.sumOfAbsValues(other: Int): Int {
    return this.absoluteValue + other.absoluteValue
}

fun Int.absValueOfSum(other: Int): Int {
    return abs(this  + other)
}

fun main() {
    var a = 4
    var b = -6

    println(a.plus(b))
    println(a.sumOfAbsValues(b))
    println(a.absValueOfSum(b))
}


