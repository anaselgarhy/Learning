package com.company;

//الكلاس الاساسي لجميع المركبات
public class Vehicle {
    protected String madeIn; //أين تم صنع المركبة
    protected int numberOfWheels; //عدد عجلات المركبة
    protected String color; // لون المركبة
    public Vehicle(String madeIn, int numberOfWheels, String color){
        this.madeIn = madeIn;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }
    public Vehicle(){

    }
    public void print(){
        System.out.println("نوع المركبة: "+getClass().getName());
        System.out.println("صنعت في: "+ madeIn);
        System.out.println("عدد العجلات: "+ numberOfWheels);
        System.out.println("اللون: "+ color);
    }
}
