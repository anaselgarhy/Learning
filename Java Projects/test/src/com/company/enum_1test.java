package com.company;

public class enum_1test {
    enum cone{
        vanela,
        chcolate,
        whiteKream
    }
    public static void main(String[] args){
        cone con1 = cone.vanela;
        cone con2 = cone.whiteKream;
        System.out.println("Cone 1: " + con1.name());
        System.out.println("Cone 2: " + con2);

    }
}
