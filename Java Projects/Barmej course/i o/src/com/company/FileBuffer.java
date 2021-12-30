package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileBuffer {
    public static void main(String[] args) throws Exception{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        String data;
        while ((data = bufferedReader.readLine()) != null){
            System.out.println(data);
        }
    }
}
