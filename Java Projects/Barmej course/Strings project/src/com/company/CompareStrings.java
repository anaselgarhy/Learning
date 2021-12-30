package com.company;

public class CompareStrings {
    public static void main(String[] args){
        String s1 = new String("مرحبا");
        String s2 = "مرحبا";
        String s3 = "Barmej Java";
        String s4 = "barmej java";
        if(s1.equals("مرحبا")){
            System.out.println("النص في s1 يماثل مرحبا");
        } else {
            System.out.println("النص في s1 لا يماثل مرحبا");
        }

        if(s2 == "مرحبا"){
            System.out.println("النص في s1 يماثل مرحبا");
        } else {
            System.out.println("النص في s1 لا يماثل مرحبا");
        }

        if(s3.equals(s4)){
            System.out.println("النصان متماثلان");
        } else {
            System.out.println("النصان غير متماثلان");
            // دالة ايكولس كيس سينستف
        }

        if(s3.equalsIgnoreCase(s4)){
            System.out.println("النصان متماثلان");
        } else {
            System.out.println("النصان غير متماثلان");
            // دالة ايكولس إيغنور كيس غير حساسة لحلة الاحرف
        }
    }
}
