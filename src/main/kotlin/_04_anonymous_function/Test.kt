package _04_anonymous_function

val sum = fun(x: Int, y: Int): Int = x + y
val diff = fun(x: Int, y: Int): Int {
    return x - y
}

fun main() {
    println("2 + 3 = ${sum(2, 3)}")
    println("2 - 3 = ${diff(2, 3)}")
}