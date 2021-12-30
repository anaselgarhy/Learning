package com.company;

public class StringBuilderFunctions {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("مرحبا بك في برمج.كوم");
        // دالة انشور كابستي تستخدم لتحديد الحد الادني للسعة اذا كانت معلومة للزيادة من كفائة البرنامج
        sb.ensureCapacity(75);
        // دالة ست لنث تستخدم لتحديد عدد الاحرف او الارقام او الرموز في النص داخل سترنج بلدر
        sb.setLength(11);
        //  لمعرفة طول النص الذي يتضمن ارقام واحرف ورموز نستخدم دالة لنس والتي تعطينا عدد صحيح
        System.out.println(sb.length());
        // لمعرفة السعة نستخدم الدالة كابستي والتي تعطينا عدد صحيح ايضا
        System.out.println(sb.capacity());
        //
        System.out.println(sb);

    }
}
