package com.company;

import java.text.Format;

public class test4 {
    public static void main(String[] args){

    String str1 = "anas ";
    String str2 = "ahmed";

    printWelcome(); printWelcome(); printWelcome();

    System.out.println(str1.concat(str2));
    System.out.println(str1 + str2);
    System.out.println(str1.charAt(0));
    System.out.println(str1.toUpperCase());
    System.out.println(str1.toLowerCase());
    System.out.println(str1.endsWith("ahmed"));
    System.out.println(str1.length());


    }
    static void printWelcome(){
        System.out.println("Welcome!");
    }
}
