package _09_infix_notation

fun main() {
    for (i in 1 until 10)
        println(i)

    println(true and false)

    var x = 1 to "one" // x = Pair(1, "one")
    println("${x.first}: ${x.second}")
}