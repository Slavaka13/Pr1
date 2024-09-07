fun main() {
    println("Введите два числа и операцию:")
    val input = readLine()?.split(" ") ?: return

    if (input.size != 3) {
        println("Неверный формат ввода")
        return
    }

    val num1 = input[0].toDoubleOrNull() ?: return
    val num2 = input[1].toDoubleOrNull() ?: return
    val operation = input[2]

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else null
        else -> null
    }

    if (result != null) {
        println("Результат: $result")
    } else {
        println("Неверная операция")
    }
}
