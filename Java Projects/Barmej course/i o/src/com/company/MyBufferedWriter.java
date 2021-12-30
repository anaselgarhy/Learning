package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class MyBufferedWriter {
    public static void main(String[] args)throws Exception{
        File file = new File("output2.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("مررحبا بك");
        bufferedWriter.newLine();
        bufferedWriter.write("في بررمج");
        bufferedWriter.close();
    }
}
