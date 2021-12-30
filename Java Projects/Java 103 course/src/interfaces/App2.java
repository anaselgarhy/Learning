package interfaces;
public class App2 implements MyInterface {
    @Override
    public void print() {
        System.out.println("Welcome to App2");
    }
    @Override
    public int getData(int num) {
        return 0;
    }
}
