package expressions;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        a = a + 1; // Increment a by 1
        System.out.println("a = " + a);

        int friends = 5;
        friends++; // Increment friends by 1
        System.out.println("friends = " + friends);

        friends--; // Decrement friends by 1
        System.out.println("friends = " + friends);

        int b = 10;
        b = b % 2; // b modulo 2 = 0
        System.out.println("b = " + b);

        b = 10; // b = 10
        b %= 2; // b modulo 2 = 0
        System.out.println("b = " + b);

        int c = 10;
        c = c % 3; // c modulo 3 = 1
        System.out.println("c = " + c);
    }
}
