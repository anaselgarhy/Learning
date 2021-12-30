package objectClass.objectClassAndFunctions;

public class Main {
    public static void justFunc(Object o){}
    public static Object justReturn(){
        return new C();
    }
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.getObj().value);
        a.getObj().print();

    }
}
