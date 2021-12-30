package firstPackage;

public class Polymorphism {
    void num(int n){
        System.out.println("Integer: " + n);
    }
    void num(float n){
        System.out.println("Float: " + n);
    }
    void num(double n){
        System.out.println("Double: " + n);
    }
    public static void main(String[] args){
        new Polymorphism().num(3);
        new Polymorphism().num(8.9f);
        new Polymorphism().num(4.6);
    }
}
