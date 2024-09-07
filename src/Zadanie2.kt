fun main() {
    print("Введите строку: ")
    val input = readln()
    val chars:MutableMap<Char, Int> = mutableMapOf()

    for (char in input) {
        if (!chars.keys.contains(char)) chars[char] = 1
        else chars[char] = chars[char]!! + 1
    }

    for (i in chars.keys) {
        println("$i - ${chars[i]}")
    }
}