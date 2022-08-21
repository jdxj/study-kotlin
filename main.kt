import kotlin.math.max

fun main() {
    for (i in 10 downTo 1) {
        println(i)
    }
}

fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) {
    num1
} else {
    num2
}

fun getScore(name: String) = when {
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("Int")
        is Double -> println("Double")
        else -> println("number not support")
    }
}