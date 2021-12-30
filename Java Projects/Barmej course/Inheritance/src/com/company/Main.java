package com.company;

public class Main {

    public static void main(String[] args) {
        Father father =new Father("أحمد","محمد");
        Son son = new Son("انس","الجارحي");
        son.print();
        father.print();
    }
}
