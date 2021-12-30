package nestedClass.localInnerClass;

public class A {
    public int val;
    public void justFunction(){
        class Welcome { // Called local inner class

        }
        Welcome w = new Welcome();
    }
}
