package firstPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int num;
        try{
            System.out.print("Please enter number: ");
            num = input.nextInt();
            num = 8/0;
        }catch(InputMismatchException ex){
            System.out.println("The input not integer!");
        }catch(ArithmeticException e){
            System.out.println("8/0 not define");
        }
        System.out.println("App is done");
    }
}
