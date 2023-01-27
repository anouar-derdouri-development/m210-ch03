package _07_some_useful_functions

import kotlin.math.absoluteValue

fun main() {
    val numbers = listOf(1, 2, 3)
    println(numbers.map { it * 3 })

    val setOfNumbers = setOf(1, 2, 3, 1)
    println(setOfNumbers)

    val listOfNumbers = listOf(1, 2, 3, 1)
    println(listOfNumbers)

    val names = listOf("hassan", "hamid", "imane", "said")
    val newNames = names.map { it.uppercase() }
    println(newNames)

    println(numbers.mapIndexed { idx, value -> value * idx })

    println(names.mapIndexed() { i, name -> "Name ${i + 1}: $name" })

    println(names.map { it.uppercase() }.mapIndexed() { i, name -> "Name ${i + 1}: $name" })

    println(names.map { it.length })

    println(names.map { it.length > 5 })

    val ints = listOf(1, 0, -5, 2, 13, -4, 7, -9)
    println(ints.filter { it > 0 }.sum())

    println(ints.map { it.absoluteValue }.average())

}