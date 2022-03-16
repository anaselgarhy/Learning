package lamda;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = () -> System.out.println("Hi :D");

        myInterface.print();

        MyAuthorInterface myAuthorInterface = (n, s) -> {
            System.out.println("Hi " + s + n);
            for (int i = 0; i < 10; i++) {
                System.out.print(s);
            }
            System.out.println();
        };

        myAuthorInterface.massage("Anas", '-');
    }
}
