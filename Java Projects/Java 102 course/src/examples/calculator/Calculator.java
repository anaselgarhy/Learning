package examples.calculator;

public class Calculator {
    public static double num1, num2, result;
    public static void add(double num1, double num2){
        setNumbers(num1, num2);
        result =  num1 + num2;
    }
    public static void subtract(double num1, double num2){
        setNumbers(num1, num2);
        result = num1 - num2;
    }
    public static void divide(double num1, double num2) throws ArithmeticException{
        if(num2 == 0)
            throw new ArithmeticException("Can't divide " + num1 + " by zero!");
        setNumbers(num1, num2);
        result = num1 / num2;
    }
    public static void multiply(double num1, double num2){
        setNumbers(num1, num2);
        result = num1 * num2;
    }
    private static void setNumbers(double num1, double num2){
        Calculator.num1 = num1;
        Calculator.num2 = num2;
    }
}
