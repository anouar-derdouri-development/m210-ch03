package _08_lambda_vs_anonymous


fun main() {
    val strings = listOf("kotlin", "is", "an", "awesome", "programming", "language")

    // Lambda expression
    println(strings.map {
//        M1
        it.uppercase()

//        M2
        return@map it.uppercase()
    })

    // Anonymous function
    println(strings.map(fun(s: String): String {
        return s.uppercase()
    }))

    // Anonymous function
//    println(strings.map(fun(s: String): String = s.uppercase()
//    ))
}