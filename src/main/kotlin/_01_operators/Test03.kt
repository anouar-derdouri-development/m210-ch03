package _01_operators

fun main() {
    var e1 = Entier(5)
    var e2 = Entier(3)
    var e3 = e1 + e2 // e1.plus(e2)

    println("$e1 + $e2 = $e3")

    var e4 = e1 + 'a'
    println("$e1 + 'a' = $e4")
}