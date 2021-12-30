package Files;

import java.io.FileReader;

public class Read {
    public static void main(String[] args){
        try{
            FileReader fin = new FileReader("textOut.txt");
            // Read
            int ch;
            while((ch = fin.read()) != -1)
                System.out.print((char) ch);
            fin.close();
        } catch(Exception ex){
            System.out.println("Ops, can't open file");
        }
    }
}
