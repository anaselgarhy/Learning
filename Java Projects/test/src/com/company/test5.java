package com.company;

import java.util.Scanner;

public class test5 {

    public static void main(String[] args) {
        String choices = "ABCD";
        short numOfQuestions;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of questions: ");
        numOfQuestions = input.nextShort();
        for(short i=0; i< numOfQuestions; i++)
            System.out.println("Answer[" + (i+1) + "]: " + choices.charAt((int)(Math.floor(Math.random() * 4))));
    }
}
