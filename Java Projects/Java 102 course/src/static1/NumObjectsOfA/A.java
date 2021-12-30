package static1.NumObjectsOfA;

public class A {
    private static int numObjects  = 0;
    public A(){
        numObjects++;
    }
    public static int getCount(){
        return A.numObjects;
    }
}
