package com.MPPCourse;

import java.text.DecimalFormat;

public class PayCheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;

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


    public double getNetPay() {
        return getGrossPay() - this.ficaTax - this.stateTax - this.localTax - this.medicareTax - this.socialSecurityTax;
    }



    public String print() {
        DecimalFormat df = new DecimalFormat("#.##");
        String ficaString = df.format(this.ficaTax);
        String stateString = df.format(this.stateTax);
        String localString = df.format(this.localTax);
        String medicareString = df.format(this.medicareTax);
        String socialSecurityString = df.format(this.socialSecurityTax);
        String netPayString = df.format(getNetPay());

        return "FICA Tax: " + ficaString + "\n" +
                "State Tax: " + stateString + "\n" +
                "Local Tax: " + localString + "\n" +
                "Medicare Tax: " + medicareString + "\n" +
                "Social Security Tax: " + socialSecurityString + "\n" +
                "Net Salary: " + netPayString + "\n";

    }
}
