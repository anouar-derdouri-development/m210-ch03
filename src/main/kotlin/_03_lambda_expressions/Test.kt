package _03_lambda_expressions

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

fun main() {
    var a = 3
    var b = 14
    println("$a + $b = ${sum(a, b)}")
}