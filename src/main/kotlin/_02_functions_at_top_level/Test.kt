package _02_functions_at_top_level

fun main() {
    var s = "ali"
    println("$s: ${titleCase(s)}")

    var n = 15
    println("$n is prime: ${isPrime(n)}")

    n = 11
    println("$n is prime: ${isPrime(n)}")
}