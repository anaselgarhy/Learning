package Files;

import java.io.FileWriter;

public class Write {
    public static void main(String[] args){
        try{
            FileWriter fout = new FileWriter("textOut.txt");
            fout.write("Hello this is my first file created with java");
            fout.close();
        } catch (Exception ex){
            System.out.println("Ops, can't created file");
        }
    }
}
