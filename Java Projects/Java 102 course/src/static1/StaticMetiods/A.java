package static1.StaticMetiods;

public class A {
    private static int val;
    public static void setVal(int val){
        A.val = val; // Look here
    }
    public static int getVal(){
        return val;
    }
    public void printVal(){
        System.out.println("val = " + this.val);
    }
}
