package com.MPPCourse;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
    private long orderNo;
    private LocalDate orderDate;
    private int orderAmount;

    public Order(long orderNo, LocalDate orderDate, int orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public long getOrderNo() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getOrderAmount() {
        return orderAmount;
    }
}
