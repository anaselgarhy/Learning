package com.company;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee sEmp = new SalariedEmployee("أنس","1234",4000);
        HourlyEmployee hEmp = new HourlyEmployee("محمد","3432",15,50);
        System.out.print(sEmp.toString());
        System.out.print(hEmp.toString());
    }
}
