package _07_some_useful_functions

fun main() {
    val list = listOf("one", "two", "three", "four")

    println(list.any { it.endsWith("e") })
    println(list.any { it.endsWith("t") })
    println(list.any { it.startsWith("t") && it.endsWith("e") })
    println(list.any { it.startsWith("e") && it.endsWith("e") })
}