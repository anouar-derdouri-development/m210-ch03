package _06_high_order_functions

fun returnNewString(s: String, f: (String) -> String): String {
    return f(s)
}

fun getVowels(s: String): String {
    val l = mutableListOf<Char>()

    for (c in s)
        if (c.lowercase() in "aeouiy")
            l.add(c)

    return l.joinToString("")
}

fun getFirstAndLast(s: String): String {
    return s[0].toString() + s[s.length - 1].toString()
}

fun main() {
    var s = ""
    var newS = ""

    s = "salam"
    newS = returnNewString(s, ::getVowels)
    println(newS)

    s = "bonjour"
    newS = returnNewString(s, ::getVowels)
    println(newS)

    s = ('A'..'z').toList().toString()
    newS = returnNewString(s, ::getVowels)
    println(newS)

    s = "bonjour"
    newS = returnNewString(s, ::getFirstAndLast)
    println(newS)

    s = "salam"
    newS = returnNewString(s, String::uppercase)
    println(newS)
}
