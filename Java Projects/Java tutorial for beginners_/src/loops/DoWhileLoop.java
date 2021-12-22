package loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        // Get the name from the user and check if it is empty
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());

        // Print the name
        System.out.println("Hello " + name);
    }
}
