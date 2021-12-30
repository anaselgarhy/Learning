package com.company;

public class Car extends Vehicle{
    public Car(String madeIn, int numberOfWheels, String color){
        super(madeIn, numberOfWheels, color);
    }

    @Override
    public void print() {
        System.out.println("هذا كلاس car");
        System.out.println(madeIn);
        System.out.println(numberOfWheels);
        System.out.print(color);
    }
}
