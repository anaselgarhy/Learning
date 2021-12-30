package com.company;

public class Apparel implements Payments, PrintMessage{
    String name;
    double price;
    double discount;
    String tag;

    public Apparel(String name, double price, double discount, String tag) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.tag = tag;
    }

    @Override
    public double getPaymentTotal() {
       if(tag.equals("outlet")){
           return (price - (price * discount));
       } else {
           return price;
       }
    }

    @Override
    public String printIt() {
        return "مرحبا بك في قسم الملابس";
    }

    @Override
    public String toString() {
        return "إسم القطعة: " + name + "\n"
                + "الخصم: " + discount + "\n"
                + "السعر الإجمالي: " +  getPaymentTotal() + "\n";
    }
}
