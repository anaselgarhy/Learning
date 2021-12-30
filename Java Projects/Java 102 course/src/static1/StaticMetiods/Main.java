package static1.StaticMetiods;

public class Main {
    public static void main(String[] args){
        // A.val = 10; // Error
        A a = new A();
        A.setVal(10);
        a.printVal();
    }
}
