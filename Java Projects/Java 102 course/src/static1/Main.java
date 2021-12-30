package static1;

public class Main {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        a1.x = 10; // Look here
        System.out.println("a1.x = " + a1.x);
        System.out.println("a2.x = " + a2.x);
        A.x = 27; // Look here
        System.out.println("A.x = " + A.x);
    }
}
