fun main() {
    print("Введите строку: ")
    val inputVal = readln()
    var result = ""
    var countChar = 1

    for(i in 1 until inputVal.length)
    {
        if (inputVal[i-1] == inputVal[i]) {
            countChar++
        } else {
            result += inputVal[i-1]
            if (countChar > 1) {
                result += countChar
            }
            countChar = 1
        }
    }

    result += inputVal[inputVal.length - 1]
    if (countChar > 1) {
        result += countChar
    }

    println(result)
}