package generics.classes;

public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer> numInt = new MyGenericClass<>(22);
        MyGenericClass<Double> numDouble = new MyGenericClass<>(3.88);
        MyGenericClass<Character> character = new MyGenericClass<>('Y');
        MyGenericClass<String> str = new MyGenericClass<>("Anas");

        System.out.println(numInt.getA());
        System.out.println(numDouble.getA());
        System.out.println(character.getA());
        System.out.println(str.getA());
    }
}
