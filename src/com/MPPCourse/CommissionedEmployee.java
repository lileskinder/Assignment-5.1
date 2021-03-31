package com.MPPCourse;

import java.util.List;

public class CommissionedEmployee extends Employee {
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public CommissionedEmployee(String empID, double commission, double baseSalary, List<Order> orders) {
        super(empID);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay() {

        double commissionAmount = 0;
        for (Order order : this.orders) {
            commissionAmount += order.getOrderAmount() * (this.commission/100);
        }

        commissionAmount +=  this.baseSalary;

        return commissionAmount;
    }
}
