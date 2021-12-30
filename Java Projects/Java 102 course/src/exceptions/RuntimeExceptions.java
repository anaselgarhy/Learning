package exceptions;

import java.util.InputMismatchException;

public class RuntimeExceptions {
    public void function(int value) { // Look here // Same throws  InputMismatchException
        if (value > 100)
            throw new InputMismatchException("over load");
        System.out.println("value = " + value);
    }
    public static void main(String[] args){
        try{
            new RuntimeExceptions().function(200);
        } catch(InputMismatchException ie){
            System.out.println(ie.getMessage());
        }
    }
}
