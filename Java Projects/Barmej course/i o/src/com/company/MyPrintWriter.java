package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyPrintWriter {
    public static void main(String[] args) throws Exception {
        File file = new File("output.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("مرحبا بك");
        printWriter.println("في برمج");
        printWriter.close();
    }
}
