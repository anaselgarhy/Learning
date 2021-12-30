package interfaces;
public class App1 implements MyInterface {
    @Override
    public void print(){
        System.out.println("Welcome to App1");
    }
    @Override
    public int getData(int num){
        return num;
    }
}
