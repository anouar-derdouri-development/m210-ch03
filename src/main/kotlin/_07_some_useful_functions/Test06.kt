package _07_some_useful_functions

fun main() {
    val set = setOf("one", "two", "three", "four")
    println(set.all { it.endsWith("e") })
    println(set.all { it.startsWith("(f|t)") || it.endsWith("e") }) // ToDo: Use Regex +2
    println(set.all {
        val c1 = it.startsWith("f")
        val c2 = it.startsWith("t")
        val c3 = it.endsWith("e")

        c1 || c2 || c3
    })
}