package javaPrintfMethod;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%d %f %s", 1, 2.5, "Hello");

        // %d - integer
        // %f - float or double
        // %s - string
        // %c - character
        // %b - boolean
        // %x - hexadecimal
        // %o - octal
        // %e - scientific notation
        // %i - integer

        // %n - new line
        // %t - tab

        // %+ - positive sign

        // %- - left align

        System.out.printf("%+d %n", 1);
        System.out.printf("%+d %n", -1);

        System.out.printf("%10s %n", "Hello");
        System.out.printf("%-10s %n", "Hello");

        System.out.printf("%10.5f %n", 2.5);
    }
}
