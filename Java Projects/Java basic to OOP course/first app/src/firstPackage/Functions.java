package firstPackage;

public class Functions {
    static void drawLine1(int size){
        for(int i=1; i<=size; i++){
            System.out.println("*");
            for(int j=0; j<i; j++)
                System.out.print(' ');
        }
    }
    void drawLine2(int size){
        for(int i=1; i<=size; i++){
            System.out.println("*");
            for(int j=0; j<i; j++)
                System.out.print(' ');
        }
    }
    public static void main(String[] args){
        drawLine1(5);
        new Functions().drawLine2(5);
    }
}
