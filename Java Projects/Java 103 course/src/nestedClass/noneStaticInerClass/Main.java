package nestedClass.noneStaticInerClass;

public class Main {
    public static void main(String[] args){
        A a = new A();
        A.X  x = a.new X();
        System.out.println(x.val);
        A.X.p();
    }
}
