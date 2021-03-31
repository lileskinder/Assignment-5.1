package com.MPPCourse;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Employee {
    private String empID;

    public Employee(String empID) {
        this.empID = empID;
    }



    public PayCheck calcCompensation() {
        return new PayCheck(calcGrossPay());
    }


    public abstract double calcGrossPay();

    public void print() {
        String empId = "Employee ID: " + this.empID;
        String grossPay = "Gross Pay: " + calcGrossPay();
        //Order

        System.out.println(empId + " " + "\n" +
                grossPay + "\n" +
                calcCompensation().print() + "\n"
//order.getOrderDate().getMonth().getValue(), order.getOrderDate().getYear()
        );
    }

}
