package com.MPPCourse;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String empID, double salary) {
        super(empID);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay() {
        return this.salary;
    }
}
