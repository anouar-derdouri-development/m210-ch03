package _07_some_useful_functions

fun main() {
    val countries = listOf("Germany", "India", "Japan", "Brazil", "Australia")
    var list = mutableListOf("United States", "Canada")
    countries.filterTo(list, { it.length > 5 })

    println(list)
}