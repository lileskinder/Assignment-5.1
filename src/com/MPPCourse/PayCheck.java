package com.MPPCourse;

import java.util.*;

public class PayCheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;
    //private final DateRange payPeriod;

    private final double ficaTax;
    private final double stateTax;
    private final double localTax;
    private final double medicareTax;
    private final double socialSecurityTax;


    public PayCheck(double grossPay) {
        this.grossPay = grossPay;
        //this.payPeriod = payPeriod;
        this.fica = 0.23;
        this.state = 0.05;
        this.local = 0.01;
        this.medicare = 0.03;
        this.socialSecurity = 0.075;

        this.ficaTax = getGrossPay() * this.fica;
        this.stateTax = getGrossPay() * this.state;
        this.localTax = getGrossPay() * this.local;
        this.medicareTax = getGrossPay() * this.medicare;
        this.socialSecurityTax = getGrossPay() * this.socialSecurity;

    }

    public double getGrossPay() {
        return grossPay;
    }

//    public DateRange getPayPeriod() {
//        return payPeriod;
//    }

    public double getNetPay() {
        double netPay = 0;
        //if (payPeriod.isInRange()) {
            netPay = getGrossPay() - this.ficaTax - this.stateTax - this.localTax - this.medicareTax - this.socialSecurityTax;
       // }
        return netPay;
    }



    public String print() {
        return  "FICA Tax: "+ this.ficaTax+ "\n" +
                "State Tax = " + this.stateTax + "\n" +
                "Local Tax = " + this.localTax + "\n" +
                "MedicareTax: " + this.medicareTax + "\n" +
                "Social Security Tax: " + this.socialSecurityTax + "\n" +
                "Net Salary: " + getNetPay();
    }
}
