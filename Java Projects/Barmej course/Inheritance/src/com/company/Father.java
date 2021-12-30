package com.company;

public class Father {
    private String firstName;
    private String lastName;
    public Father(String firstName,  String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void print(){
        System.out.println("الاسم: "+ firstName+ " "+ lastName);
    }
}
