package _06_high_order_functions

fun doSomethingToString(
    s: String,
    f: (String) -> Unit,
) {
    f(s)
}

fun printVertically(s: String) {
    for (c in s)
        println(c)
}

fun main() {
    var s = "bonjour"

    doSomethingToString(s, ::print)
    doSomethingToString(s, ::println)
    doSomethingToString(s, ::printVertically)
}