package _07_some_useful_functions

fun main() {
//    val map = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 1 to "un")
//    println(map)

    val map = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four")
    println(map.none { it.value.endsWith("e") })
    println(map.none { it.value.endsWith("t") })
    println(map.filter { it.value.endsWith("e") })
    println(map.filter { it.value.endsWith("e") }.map { it.value })
    println(map.filter { it.value.endsWith("e") }.map { Pair(it.key, it.value) })
}