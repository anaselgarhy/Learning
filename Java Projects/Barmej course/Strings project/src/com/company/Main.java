package com.company;

public class Main {

    public static void main(String[] args) {
        String s = new String("موقع برمج");
        char[] charArray = new char[4];
        System.out.println(s.length());
        System.out.println(s.charAt(2));

        s.getChars(5,9,charArray,0);
        System.out.println(charArray);
    }
}
