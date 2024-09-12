fun main() {
    val i1:Int
    val i2:Int
    try {
        print("Введите число a: ")
        i1 = readln().toInt()
        print("Введите число b: ")
        i2 = readln().toInt()
    } catch (e:NumberFormatException) {
        println("Ошибка ввода")
        return
    }

    if (i1 % 2 == 1) println(i1)
    else if (i2 % 2 == 1) println(i2)
    else println("Создать нечетное число невозможно")
}