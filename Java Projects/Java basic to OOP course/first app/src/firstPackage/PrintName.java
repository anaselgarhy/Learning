package firstPackage;

import java.util.Scanner;

public class PrintName {
    static Scanner input = new Scanner(System.in); // Look here
    public static void main(String[] args){
        System.out.print("Please enter your name: ");
        String name = input.next();
        System.out.println("Hello, " + name);
    }
}
