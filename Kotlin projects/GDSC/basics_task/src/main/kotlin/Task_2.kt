fun main(args: Array<String>) {
    var num:Int =0
    println("<----------- Welcome ----------->")
    while(true) {
        print("Enter the number: ")
        try {
            num = readLine()!!.toInt()
            break
        } catch (e: Exception) {
            println("Invalid input")
        }
    }
    println("$num is ${if (num % 2 == 0) "even" else "odd"} number")
}