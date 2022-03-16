// check Whether a Character is Alphabet or Not.
fun main() {
    print("Enter a character: ")
    val ch = readLine()!!.toCharArray()[0]
    if (ch in 'a'..'z' || ch in 'A'..'Z') {
        println("Alphabet")
    } else {
        println("Not Alphabet")
    }
}