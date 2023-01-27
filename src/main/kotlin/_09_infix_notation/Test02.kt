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

    println()

    x.infixFunction(2)

    println()

    3 infixFunction 4
}

class MyClass(val a: Int) {
    infix fun infixFunction(other: MyClass) {
        // M1
//        infixFunction(other.a)

        // M2
//        this.infixFunction(other.a)

        // M3
        this infixFunction other.a
    }

    infix fun infixFunction(p: Int) {
        // M1
        for (i in 1..a) {
            for (j in 1..p) {
                print("* ")
            }

            println()
        }

        // M2
//        a infixFunction p
    }
}

infix fun Int.infixFunction(p: Int) {
    for (i in 1..this) {
        for (j in 1..p) {
            print("* ")
        }

        println()
    }
}