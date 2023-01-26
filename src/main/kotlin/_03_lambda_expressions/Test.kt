package _03_lambda_expressions

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
val prod = { x: Int, y: Int -> x * y }
val printProd = { x: Int, y: Int -> print(x * y) }

fun main() {
    var a = 3
    var b = 14
    println("$a + $b = ${sum(a, b)}")
    println("$a * $b = ${prod(a, b)}")

    print("$a * $b = ")
    printProd(a, b)
    println()
}