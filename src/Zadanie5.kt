import kotlin.math.log

fun main() {
    println("Введите целое число и основание степени (ЧИСЛО ОСНОВАНИЕ):")
    val input = readlnOrNull()?.split(" ") ?: return

    if (input.size != 2) {
        println("Неверный формат ввода")
        return
    }

    val n = input[0].toDoubleOrNull() ?: return
    val x = input[1].toDoubleOrNull() ?: return

    val l = log(n, x)
    if (l.toInt().toDouble() == l) println("Целочисленный показатель: ${l.toInt()}")
    else println("Целочисленный показатель не существует")

}