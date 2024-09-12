fun main() {
    print("Введите число a: ")
    val i1 = readln().toInt()
    print("Введите число b: ")
    val i2 = readln().toInt()

    if (i1 % 2 == 1) println(i1)
    else if (i2 % 2 == 1) println(i2)
    else println("Создать нечетное число невозможно")
}