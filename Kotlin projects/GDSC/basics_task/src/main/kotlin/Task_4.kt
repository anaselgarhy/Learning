fun main() {
    val array = arrayOf(1, 2, 3, 4, 76, 6, 65, 8, 54, 10)
    var num = 0

    println("<-------- Welcome ----------->")
    while (true) {
        print("Enter the number to search: ")
        try {
             num = readLine()!!.toInt()
            break
        } catch (e: Exception) {
            println("Invalid input")
        }
    }

    if (num in array) {
        println("Number $num is in the array")
    } else {
        println("Number $num is not in the array")
    }
}