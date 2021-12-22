package loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        // Get the user's name and chyck if it is empty
        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        // Print the name
        System.out.println("Hello " + name);
    }
}
