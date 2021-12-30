package com.company;

public class InsertAndDeleteFunctions {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("برمج");
        //
        sb.insert(0,"موقع ");
        sb.insert(0,"مرحبا");
        sb.insert(14,".كوم");
        //
        sb.delete(6,10);
        sb.insert(5,"بك في ");
        System.out.println(sb.toString());
    }
}
