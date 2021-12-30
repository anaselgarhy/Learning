package com.company;

public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee(String name, String idNumber, double salary) {
        super(name, idNumber);
        setMonthlySalary(salary);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary > 0.0){
            this.monthlySalary = monthlySalary;
        } else{
            this.monthlySalary = 0.0;
        }
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return String.format("الموظف بمرتب شهري: \n%sالمرتب: %f\n",
                super.toString(),
                earnings());
    }
}
