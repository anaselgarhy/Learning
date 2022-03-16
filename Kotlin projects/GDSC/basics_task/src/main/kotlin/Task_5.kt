fun main() {
    var num = 0.0
    println("<------------ Welcome ----------->")

    while (true) {
        print("Enter a number: ")
        try {
            num = readLine()!!.toDouble()
            break
        } catch (e: NumberFormatException) {
            println("Invalid number!")
        }
    }
    print("The number is ${if (num < 0) "negative" else "positive"} number")
}