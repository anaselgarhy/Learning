package loops;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = input.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = input.next().charAt(0);

        // Print
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
