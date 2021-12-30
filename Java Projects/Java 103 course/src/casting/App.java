package casting;

public class App implements MyInterface {
    @Override
    public void print(){
        System.out.println("App");
    }
    @Override
    public int getData(){
        return  8;
    }
    public void dummy(){
        System.out.println("Dummy");
    }
}
