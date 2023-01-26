package _01_operators

class Entier(var value: Int) {
    operator fun plus(other: Entier): Entier {
        return Entier(this.value + other.value)
    }

    operator fun plus(other: Char): Entier {
        return Entier(this.value + other.code)
    }

    override fun toString(): String {
        return "$value"
    }
}