package nestedClass.staticInnerClass;

public class A { // Called Outer class for X class And Y class
    public int value = 7;
    public static final int num = 10; // Look here
    public static void print(int num){ // Look here
        System.out.println("num = " + num);
    }
    public class X{ // none static
    }
    public static class Y { // Static
        private int value;
        private int number = new A().value; // Look here
        public Y(){
            this.value = num; // Look here
            print(number);
        }
    }
}
