package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryAndCatch_1 {
    public static void main(String[] args){
        int num1, num2;
        Scanner input = new Scanner(System.in);
        try { // Look here
            System.out.print("Enter number one: ");
            num1 = input.nextInt();
            System.out.print("Enter number tow: ");
            num2 = input.nextInt();
            System.out.println("The result: " + (num1 / num2));
        } catch(InputMismatchException ie){ // Look here
            System.out.println("The input not a valid number!");
            System.exit(0);
        } catch(ArithmeticException ae){
            System.out.println("Arithmetic exception!");
            return; // Look here
        } catch(Exception ex){
            System.out.println("Another exception!");
            System.exit(0); // Look here
        } finally{
            System.out.println("Done");
        }
        System.out.println("Anas Ahmed Elgarhy"); // Line 25
    }
}
