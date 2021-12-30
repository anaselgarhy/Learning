package mathClass;

import java.util.Scanner;

public class HypotenuseGetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double z;

        // Get x from user
        System.out.print("Enter x: ");
        x = input.nextDouble();

        // Get y from user
        System.out.print("Enter y: ");
        y = input.nextDouble();

        // Calculate z
        z = Math.sqrt((x * x) + (y * y));

        // Display z
        System.out.println("The hypotenuse is " + z);

        // Close scanner (not necessary but good practice)
        input.close();
    }
}
