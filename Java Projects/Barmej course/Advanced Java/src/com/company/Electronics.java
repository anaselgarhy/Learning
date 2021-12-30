package com.company;

public class Electronics implements Payments, PrintMessage{
    int count;
    String name;
    double price;
    boolean delivery;

    public Electronics(int count, String name, double price, boolean delivery) {
        this.count = count;
        this.name = name;
        this.price = price;
        this.delivery = delivery;
    }

    @Override
    public double getPaymentTotal() {
        if(delivery){
            return (count * price) + 2.0;
        } else{
            return count * price;
        }
    }

    @Override
    public String printIt() {
        return "مرحبا بك في قسم الإلكترونيات";
    }

    @Override
    public String toString() {
        return "إسم القطعة: " + name + "\n"
                + "العدد: " + count + "\n"
                + "السعر الإجمالي: " +  getPaymentTotal() + "\n";
    }
}
