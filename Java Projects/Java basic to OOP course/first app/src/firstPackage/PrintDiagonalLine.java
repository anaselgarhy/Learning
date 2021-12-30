package firstPackage;

public class PrintDiagonalLine {
    public static void main(String[] args){
        for(short i=1; i<=10; i++){
            System.out.println('*');
            for(short j=0; j<i; j++)
                System.out.print(' ');
        }
    }
}
