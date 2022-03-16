fun main(args: Array<String>) {
    var firstNum:Double = 0.0
    var secondNum:Double = 0.0
    var operator:Char = ' '

    println("<----------- Welcome ----------->")
    var i = 1;
    while(i <= 2) {
        System.out.printf("Enter the %s number: ", if(i == 1) "first" else "second")
        try {
            when (i) {
                1 -> firstNum = readLine()!!.toDouble()
                2 -> secondNum = readLine()!!.toDouble()
            }
        } catch (e: NumberFormatException) {
            println("Invalid number")
            continue
        }
        i++
    }
    print("Enter the operator: ")
    operator = readLine()!!.toCharArray()[0]
    print("$firstNum $operator $secondNum = ${when (operator) {
        '+' -> firstNum + secondNum
        '-' -> firstNum - secondNum
        '*' -> firstNum * secondNum
        '/' -> firstNum / secondNum
        else -> {
            println("Invalid operator")
            return
        }
    }
    }")
}