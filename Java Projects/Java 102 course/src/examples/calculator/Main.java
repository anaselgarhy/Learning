package examples.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String inputLine = "";
        do{
            try{
                printMenu();
                inputLine = input.next(); // Read choice from user
                switch (inputLine) {
                    case "1" -> Calculator.add(readNumber((byte)1), readNumber((byte)2));
                    case "2" -> Calculator.subtract(readNumber((byte)1), readNumber((byte)2));
                    case "3" -> Calculator.multiply(readNumber((byte)1), readNumber((byte)2));
                    case "4" -> Calculator.divide(readNumber((byte)1), readNumber((byte)2));
                    case "-1" -> System.out.println("Goodbye u_u");
                    default -> System.out.println("Error choice");
                    }
                        // print result
                        if(!inputLine.equals("-1"))
                            System.out.printf("%.2f %c %.2f = %.2f\n",
                                    Calculator.num1,
                                    (inputLine.equals("1")? '+':inputLine.equals("2")? '-':inputLine.equals("3")? '*':'/'),
                                    Calculator.num2, Calculator.result);
                } catch (ArithmeticException | InputMismatchException ex){
                System.err.println(ex.getMessage());
            }
        } while (!inputLine.equals("-1"));
    }
    public static void printMenu(){
        System.out.println("[1] Sum\n[2]Subtract\n[3]Multiply\n[4]Divide\nType -1 to exit");
        System.out.print("> ");
    }
    public static double readNumber(byte num){
        System.out.printf("Please enter %s number: ", (num == 1? "first":"second"));
        return input.nextDouble();
    }
}
