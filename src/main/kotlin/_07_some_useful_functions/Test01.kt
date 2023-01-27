package _07_some_useful_functions

import _06_high_order_functions.returnNewString

val isValidCountry = { country: String ->
    country.length > 5
}

fun main() {
    val countries = listOf("Germany", "India", "Japan", "Brazil", "Australia")
//    val filterList = countries.filter(isValidCountry)
//    val filterList = countries.filter({ country: String -> country.length > 5 })
//    val filterList = countries.filter { country: String -> country.length > 5 }
    val filterList = countries.filter { it.length > 5 }

    println(filterList)
}