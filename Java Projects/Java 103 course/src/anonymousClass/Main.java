package anonymousClass;

public class Main {
    public static void main(String[] args){
        new A(){ // Look here
            public void localPrint(){
                System.out.println("Local");
            }
        }.localPrint();
    }
}
