fun main() {
    var array: Array<Int>

    println("<------- Welcome ------->")

    var arraySize = giveInput("Enter array size")
    array = Array(arraySize) { 0 }

   for (i in 0 until arraySize) {
       array[i] = giveInput("Enter element ${i + 1}")
   }
   // Print largest element
   println("Largest element is ${array.maxOrNull()}")
}

fun giveInput(mesage: String): Int {
    while (true) {
        print("Enter $mesage: ")
        try {
            return readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            println("Wrong input")
        }
    }
}