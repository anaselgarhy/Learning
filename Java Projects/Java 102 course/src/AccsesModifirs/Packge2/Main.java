package AccsesModifirs.Packge2;

public class Main {
    public static void main(String[] args){
        B b = new B();
        //System.out.println("b.val = " + b.val); // Error
        System.out.println("b.val = " + b.getVal());
    }
}
