package _05_extensions

//val realDiv: (Int, Int) -> Double = { x: Int, y: Int -> x.toDouble() / y } // Without using extension
val realDiv: Int.(Int) -> Double = { this.toDouble() / it } // With extension

fun main() {
    var a = 4
    var b = 3

//    println(realDiv(a, b)) // Without using extension
    println(a.realDiv(b)) // With extension
}




