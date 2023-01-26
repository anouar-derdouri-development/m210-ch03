package _03_lambda_expressions

typealias Type1 = (Int, Int) -> Int
typealias TripleOfDBS = Triple<Double, Boolean, String>
typealias NewPair = Pair<Int, TripleOfDBS>
typealias ListofNewPairs = List<NewPair>

val sum: Type1 = { x: Int, y: Int -> x + y }
val prod = { x: Int, y: Int -> x * y }
val printProd = { x: Int, y: Int -> print(x * y) }
val printSum = { x: Int, y: Int ->
    val s = x + y
    print(s)
}
val show = { message: String, newLine: Boolean -> // (String, Boolean) -> Unit
    if (newLine)
        println(message)
    else
        print(message)
}
val isPrime: (Int) -> Boolean = {
    var flag = true

    for (i in 2 until it)
        if (it.rem(i) == 0)
            flag = false

    flag
}


fun main() {
    var a = 3
    var b = 14
    println("$a + $b = ${sum(a, b)}")
    println("$a * $b = ${prod(a, b)}")

    print("$a * $b = ")
    printProd(a, b)
    println()

    print("$a + $b = ")
    printSum(a, b)
    println()

    show("Bonjour ", false)
    show("kotlin", true)
    show("-------", true)

    var n = 15
    println("$n is prime: ${isPrime(n)}")

    n = 11
    println("$n is prime: ${isPrime(n)}")

    var x: NewPair = Pair(1, Triple(1.2, false, "kotlin"))
    var y: NewPair = Pair(2, Triple(0.5, true, "java"))

    var l: ListofNewPairs = listOf(x, y)

    printListOfNewPairs(l)
}

fun printListOfNewPairs(l: ListofNewPairs) {
    for (item in l) {
        printNewPair(item)
    }
}

fun printNewPair(pair: NewPair) {
    print("First: ${pair.first} - ")
    print("Second:")
    printTripleOfDBS(pair.second)

    println()
}

fun printTripleOfDBS(triple: TripleOfDBS) {
    print("${triple.first} | ${triple.second}  | ${triple.third} ")
}
