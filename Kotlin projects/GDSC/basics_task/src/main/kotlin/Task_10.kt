// calculate power using recursion
fun main() {
    print("Enter a number: ")
    val n = readLine()!!.toInt()
    print("Enter a power: ")
    val x = readLine()!!.toDouble()
    println(power(x, n))
}

fun power(x: Double, n: Int): Double {
    return if (n == 0) 1.0 else x * power(x, n - 1)
}