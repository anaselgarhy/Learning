// Reverse a Sentence Using Recursion
fun main() {
    print("Enter a sentence: ")
    val sentence = readLine()!!
    println("Reversed sentence: ${reverseSentence(sentence)}")
}

fun reverseSentence(sentence: String): String {
    return if (sentence.isEmpty()) ""
    else reverseSentence(sentence.substring(1)) + sentence[0]
}