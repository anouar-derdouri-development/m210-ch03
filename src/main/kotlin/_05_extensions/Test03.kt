package _05_extensions

fun String?.lastChar(): String {
    //region M1

    //    if (this == null)
//        return "NULL"
//    else
//        return this[this.length - 1].toString()

    //endregion

    //region M2

    //    return this?.substring(this?.length ?: 0 - 1) ?: "NULL"

    //endregion

    //region M3

    this?.let {
        return this.substring(this.length - 1)
    }
    return "NULL"

    //endregion
}

fun main() {
//    var s: String? = "bonjour"
    var s: String? = null

//    println(s.toString())
    println(s.lastChar())
}




