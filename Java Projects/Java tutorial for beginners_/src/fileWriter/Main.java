package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("pome.txt");
            // write a line
            fileWriter.write("The rose is red\nViolets are blue\n");
            // Writs another line
            fileWriter.write("booty booty booty booty\n");
            // Appends a line
            fileWriter.append("A pome by Anas\n");
            // Close the file
            fileWriter.close();

            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
