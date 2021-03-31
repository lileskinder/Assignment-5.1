package com.MPPCourse;

public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursPerWeek;

    public HourlyEmployee(String empID, double hourlyWage, double hoursPerWeek) {
        super(empID);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay() {
        return this.hourlyWage * this.hoursPerWeek * 4;
    }
}
