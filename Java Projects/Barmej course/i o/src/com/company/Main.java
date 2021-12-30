package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ما هوا إسمك الاول ؟");
        String firstName = new String();
        firstName = input.next();
        if(firstName.equals("ريم"))
            System.out.println(firstName+" كم هوا اسم قبيح ؛ كم عمرك");
        if(!firstName.equals("ريم"))
            System.out.println(firstName+" كم هوا اسم رائع؛ كم عمرك");
        int age = input.nextInt();
        if(age <= 16)
            System.out.println(firstName + " يا " + firstName + " كام مرة اقولك انت تروح تلعب بعييد ");
        if(age <= 30 && age > 16)
            System.out.println("واو مازلت شابا");
        if(age >= 70)
            System.out.println("باين كدة انك عندك 9 ارواح مش 7");
        System.out.println("ما هوا ناتج قسمة 5 علي 2 ؟");
        float answer1 = input.nextFloat();
        if(answer1 == 2.5) {
            System.out.println("عرفت كيف اكيد غاششها, صح ؟");
            String ans1 = new String();
            ans1 = input.next();
            if(ans1.equals("اه") || ans1.equals("طبعا"))
                System.out.println("كنت عارف , مبروك جبت 0 باي");
            if(ans1.equals( "لا"))
                System.out.println("طبعا أنا وإنت عارفين إنك كذاااب, بس هديك نص درجة علشان مبقاش ظالم");

        }


    }
}
