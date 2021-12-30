package com.company;

public class Main {

    public static void main(String[] args) {
        TimeOverload t1 = new TimeOverload();
        TimeOverload t2 = new TimeOverload(12);
        TimeOverload t3 = new TimeOverload(12,30);
        TimeOverload t4 = new TimeOverload(12,30,60);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
    }
}
