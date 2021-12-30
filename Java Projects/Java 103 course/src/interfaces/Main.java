package interfaces;
public class Main {
    private static void print(MyInterface i){ // Look here
        i.print();
    }
    private static void runPlugin(Plugin p){
        p.loadPlugin();
        p.execute();
        p.close();
    }
    private static void getData(Demo d){
        d.getData(9);
    }
    public static void main(String[] args){
        MyInterface i = new MyInterface(){
            @Override
            public void print() {
                System.out.println("Welcome to my interface!");
            }
            @Override
            public int getData(int num) {
                return 0;
            }
        };
        print(i);
        print(new MyInterface(){
            @Override
            public void print() {
                System.out.println("Welcome to Advanced syntax");
            }
            @Override
            public int getData(int num) {
                return 0;
            }
        });
    }
}
