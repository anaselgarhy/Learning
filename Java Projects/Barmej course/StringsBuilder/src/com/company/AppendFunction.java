package com.company;

public class AppendFunction {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("موقع برمج كوم");
        sb.append("\n");
        sb.append("مسار لغة الجافا");
        sb.append("\n");
        // ويمكننا استخدام دالة ابيند بسكل متكرر
        sb.append(100).append("\n").append("أ");
        System.out.println(sb.toString());
    }
}
