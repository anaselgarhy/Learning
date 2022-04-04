fun main() {
    print("Enter array size: ")
    var arr = Array<Int>( readLine()!!.toInt() ) { 0 }

    // Read array elements from user
    for (i in arr.indices) {
        print("Enter element $i: ")
        arr[i] = readLine()!!.toInt()
    }

    // ...... complete your code
}