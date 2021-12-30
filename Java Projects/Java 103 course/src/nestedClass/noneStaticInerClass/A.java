package nestedClass.noneStaticInerClass;
public class A { // Called Outer class for X class
    public int value;
    public static int num = 10;
    public void justPrint(int num){
        System.out.println("num = " + num);
    }
    public class X {
        public int val = num;
        public static int i = 0;
        public static final int q = 9; // Look here
        public final static int q2 = 6;
        public static void p(){

        }
        public X(){
            int a = i;
        }
    }
}