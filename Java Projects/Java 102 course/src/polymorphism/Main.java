package polymorphism;
public class Main {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

        D d = new D();
        d.poly(a);
        d.poly(b);
        d.poly(c);
    }
}
