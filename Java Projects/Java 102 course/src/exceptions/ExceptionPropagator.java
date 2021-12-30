package exceptions;

import java.util.InputMismatchException;

public class ExceptionPropagator {
    public void function(int num1, int num2) throws ArithmeticException, InputMismatchException{ // Look here
        if(num2 == 0)
            throw new ArithmeticException("Can't divide by zero!");
        else if(num1 < num2)
            throw new InputMismatchException("Error numbers");
        else
            System.out.println(num1 + "/" + num2 + " = " + (num1 /num2));
    }
    public static void main(String[] args){
        new ExceptionPropagator().function(6, 7);
        try{
            new ExceptionPropagator().function(22, 0);
        } catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        } catch(InputMismatchException ie){
            System.out.println(ie.getMessage());
        }
    }
}
