package _09_infix_notation

fun main() {
    var x = MyClass(5)
    var y = MyClass(3)

    x infixFunction y

    println()

    y infixFunction x

    println()

    y infixFunction y

    println()

    x infixFunction 2
}

class MyClass(val a: Int) {
    infix fun infixFunction(y: MyClass) {
        for (i in 1..a) {
            for (j in 1..y.a) {
                print("* ")
            }

            println()
        }
    }

    infix fun infixFunction(p: Int) {
        for (i in 1..a) {
            for (j in 1..p) {
                print("* ")
            }

            println()
        }
    }

}
