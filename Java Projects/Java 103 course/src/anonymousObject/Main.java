package anonymousObject;

public class Main {
    public static void main(String[] args){
        new MyInterface(){
            @Override
            public void print(){
                System.out.println("Anas");
            }
            @Override
            public int getData(){
                return 5;
            }
        }.print();
    }
}
