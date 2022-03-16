// convert binary number to decimal.
fun main() {
    print("Enter binary number: ")
    val binary = readLine()!!
    val decimal = binary.toInt(2)
    println("Decimal: $decimal")
}