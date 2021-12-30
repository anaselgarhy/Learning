package com.company;

public class EditStrings {
    public static void main(String[] args){
        String s1 = "أحمد";
        String s2 = "barmej";
        String s3 = "BaRmEj";
        String s4 = "  java  ";
        // دالة ريبليس تقوم باستبدل الحرف الاول بالحرف الثاني
        System.out.println(s1.replace('م','ا'));
        // دالة تو ابر كيس تقوم بتحويل جميع الاحرف في النص الي احرف كبيرة
        System.out.println(s2.toUpperCase());
        // دالة تو لورر كيس تقوم بجعلل جميع الاحرف صغيرة
        System.out.println(s3.toLowerCase());
        // دالة ترم تقوم بحذف جميع المسفات في بداية ونهاية النص
        System.out.println("-" + s4.trim() + "-");

        // الدالة توكاركتار أرري تقوم بتحويل احرف نص من نوع سترنج الي مصفوفة من نوع كاركتار
        char charArray[] = s2.toCharArray();
        for(char c : charArray){
            System.out.println(c);
        }
    }
}
