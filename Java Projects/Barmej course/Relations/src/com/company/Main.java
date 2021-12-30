package com.company;

public class Main {

    public static void main(String[] args) {
	    // إنشاء كائن مستقل من البنك
        Bank bank = new Bank();
        bank.name = "البنك الاول";

        //إنشاء كائن مستقل من الموظف
        Employee employee = new Employee();
        employee.bank = bank;
        //اذا حذفنا الموظف لا  يتئثر البنك

    }
}
