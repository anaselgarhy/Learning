package com.company;

public class MyMain {
    public static void main(String[] args){
        //لا يمكن انشاء كائن مستقل للانسان من دون قلب
        Heart heart = new Heart();
        Human human = new Human(heart);
    }
}
