package userInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How are name? ");
        // Read name from user (console)
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        // Read age from user (console)
        int age = scanner.nextInt(); // \n is not read and store in the buffer
        // Read next line from buffer (to clear buffer)
        scanner.nextLine();

        System.out.println("What is your favorite food? ");
        // Read favorite food from user (console)
        String favoriteFood = scanner.nextLine();

        // Print out the information
        System.out.println("Hello " + name + " !");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite food is " + favoriteFood + ".");
    }
}
