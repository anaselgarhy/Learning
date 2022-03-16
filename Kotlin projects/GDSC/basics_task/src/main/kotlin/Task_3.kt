fun main() {
    // Initialize the array
    var numLArray:Array<Int> = arrayOf(0, 0, 0)
    println("<------------- Welcome ----------->")
    var i:Int = 0;
    while(i < 3) {
        print("Enter the number ${i + 1} : ")
        var num:Int;
        try {
           num = readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            println("Please enter a valid number")
            continue
        }
         numLArray[i] = num
        i++
    }
    // Sort the array
    numLArray.sort()
    // print highest number
    println("The highest number is : ${numLArray[2]}")
    // Print middle number
    println("The middle number is : ${numLArray[1]}")
    // Print lowest number
    println("The lowest number is : ${numLArray[0]}")

}