package _05_extensions

fun String.titleCase(): String {
    return this[0].uppercase() + this.substring(1).lowercase()
}

fun main() {
    println("ABC".titleCase())

    var s = "xyz"
    println(s.titleCase())
}