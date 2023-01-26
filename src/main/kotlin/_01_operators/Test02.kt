package _01_operators

fun main() {
    var a = (1 != 2)
    var b = 3 >= 5

    println(a.not()) // println(!a)
    println(a.and(b)) // println(a && b)
}