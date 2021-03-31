package com.MPPCourse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(111, LocalDate.of(2021, 02, 19), 2000));
        orderList.add(new Order(122, LocalDate.of(2021, 02, 13), 1000));
        orderList.add(new Order(123, LocalDate.of(2021, 02, 17), 1500));


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new HourlyEmployee("001", 50, 40));
        employeeList.add(new CommissionedEmployee("002", 10, 2000, orderList));
        employeeList.add(new SalariedEmployee("123", 6000));

        System.out.println("PAY STUB" + "\n" + "***********************************************************");

        for (Employee employee : employeeList) {
            employee.print();
        }

    }
}
