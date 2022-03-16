// sort an array in ascending order
fun main() {
    var array = arrayOf(1, 5, 3, 6, 2)
    sortArrayInAscendingOrder(array)
    println(array.contentToString())
}

fun sortArrayInAscendingOrder(array: Array<Int>) {
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - 1 - i) {
            if (array[j] < array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}