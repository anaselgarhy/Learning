package override;

public class B extends A {
    @Override // Look here
    public void print(int val){
        System.out.println("B.print, val = " + val);
    }
}
