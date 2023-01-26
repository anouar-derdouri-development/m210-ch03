package _02_functions_at_top_level

fun titleCase(value: String): String {
    return value[0].uppercase() + value.substring(1).lowercase()
}

fun main() {
    var s = "ali"
    println("$s: ${titleCase(s)}")
}