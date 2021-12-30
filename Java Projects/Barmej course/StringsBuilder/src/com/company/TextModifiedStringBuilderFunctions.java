package com.company;
//دوال StringBuilder المعدلة على النصوص
public class TextModifiedStringBuilderFunctions {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("ارحبا بك جي برمج.كوم");
        StringBuilder sb2 = new StringBuilder("1234");
        // دالة كاركتار ات تسدخدم لمعرف الحرف عند مؤشر معين
        System.out.println(sb.charAt(0));

        char[] charArray = new char[sb.length()];
        //
        sb.getChars(0,sb.length(),charArray,0);
        for(char c: charArray){
            System.out.print(c);
        }
        // دالة ست كار ات تستخدم لتعدير النص عند مؤشر معين
        System.out.println();
        System.out.println(sb);
        sb.setCharAt(0,'م');
        sb.setCharAt(9,'ف');
        System.out.println(sb);

        System.out.println(sb2);
        // تستخدم الدالة ريفيرس لعكس النص
        System.out.println(sb2.reverse());

    }
}
