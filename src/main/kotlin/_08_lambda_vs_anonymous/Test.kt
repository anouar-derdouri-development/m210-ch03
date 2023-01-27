package _08_lambda_vs_anonymous



fun main() {
    val strings = listOf("kotlin", "is", "an", "awesome", "programming", "language")

    println(strings)

    // Lambda expression
    println(strings.map {
        it.uppercase()

        return
    })

    // Anonymous function
    println(strings.map(fun(s: String): String {
        return s.uppercase()
    }))

    // Anonymous function
    println(strings.map(fun(s: String): String = s.uppercase()
    ))
}