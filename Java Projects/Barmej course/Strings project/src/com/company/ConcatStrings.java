package com.company;

public class ConcatStrings {
    public static void main(String[] args){
        String firstString = "موقع";
        String lastString = "برمج";
        String space = " ";
        //هناك طريقتان لدمج النصوص
        // الاول بالمعامل(+)
        System.out.println(firstString +" "+ lastString);
        // الثانية إستداع دالة كونكات الموجودة بكلاس سترنج
        System.out.println(firstString.concat(space.concat(lastString)));
    }
}
