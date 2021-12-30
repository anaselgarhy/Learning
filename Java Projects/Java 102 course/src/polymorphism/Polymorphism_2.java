package polymorphism;
class AA {
    public void add(int num1, int num2){
        System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
    }
}
class BB extends AA{
    @Override
    public void add(int num1, int num2){
        System.out.println(num1 + " Concoct with " + num2 + " = " + num1 + num2);
    }
}
class Polymorphism_2 {
    public static void add(AA adderType, int num1, int num2){
        adderType.add(num1, num2);
    }
    public static void main(String[] args){
        add(new AA(), 5, 7);
        add(new BB(), 5, 7);
    }
}
