package com.company;

public class HourlyEmployee extends Employee{
    private double hourlyWage;
    private double hoursWorked;
    public HourlyEmployee(String name, String idNumber, double hourlyWage, double hoursWorked) {
        super(name, idNumber);
        setHourlyWage(hourlyWage);
        setHoursWorked(hoursWorked);
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if(hourlyWage > 0.0){
            this.hourlyWage = hourlyWage;
        } else{
            this.hourlyWage = 0.0;
        }
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if(hoursWorked > 0.0){
            this.hoursWorked = hoursWorked;
        } else{
            this.hoursWorked = 0.0;
        }
    }

    @Override
    public double earnings() {
        return getHourlyWage() * getHoursWorked();
    }

    @Override
    public String toString() {
        return String.format("الموظف بمرتب بعدد ساعات العمل:\n %sمعدل العمل للساعة الواحدة: %s\nساعات العمل: %s\nالمرتب: %s\n"
                , super.toString(),
                getHourlyWage(),
                getHoursWorked(),
                earnings());
    }
}
