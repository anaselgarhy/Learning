package mathClass;

public class Main {
    public static void main(String[] args) {
        double x = 3.2;
        double y = -10;

        // Get max value between x and y
        double max = Math.max(x, y);
        System.out.println("Max value between x and y: " + max);

        // Get min value between x and y
        double min = Math.min(x, y);
        System.out.println("Min value between x and y: " + min);

        // Get absolute value of y
        double abs = Math.abs(y);
        System.out.println("Absolute value of y: " + abs);

        // Get square root of x
        double sqrt = Math.sqrt(x);
        System.out.println("Square root of x: " + sqrt);

        // Round x to the nearest integer
        double round = Math.round(x);
        System.out.println("Round x to the nearest integer: " + round);

        // Ceiling x to the nearest integer (round up)
        double ceil = Math.ceil(x);
        System.out.println("Ceiling x to the nearest integer: " + ceil);

        // Floor x to the nearest integer (round down)
        double floor = Math.floor(x);
        System.out.println("Floor x to the nearest integer: " + floor);
    }
}
