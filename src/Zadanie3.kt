fun main() {
    println("Введите натуральное число:")
    val number = readlnOrNull()?.toIntOrNull() ?: return

    val binaryString = number.toString(2)
    println("Число $number в двоичной системе: $binaryString")
}