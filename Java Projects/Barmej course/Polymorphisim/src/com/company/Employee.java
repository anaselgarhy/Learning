package com.company;

public abstract class Employee {
    private String name;
    private String idNumber;
    public Employee(String name, String idNumber){
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return String.format("الإسم: %s\nرقم الهوية:  %s\n",getName(),getIdNumber());
    }
    public abstract double earnings();
}
