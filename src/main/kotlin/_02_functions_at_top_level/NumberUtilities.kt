package _02_functions_at_top_level

fun isPrime(value: Int): Boolean {
    for (i in 2 until value)
        if (value.rem(i) == 0)
            return false

    return true
}