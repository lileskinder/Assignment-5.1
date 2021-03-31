package com.MPPCourse;

import java.time.LocalDate;


public class DateRange {
    private static LocalDate date;
    private LocalDate startDate;
    private LocalDate endDate;


    public DateRange(int month, int year) {
        this.date = LocalDate.of(year, month, 10);
        this.startDate = getFirstDayOfMonth();
        this.endDate = getLastDayOfMonth();
    }

    public boolean isInRange() {
        return (this.date.compareTo(startDate) >= 0) && (this.date.compareTo(endDate) <= 0);
    }

    public static LocalDate getFirstDayOfMonth() {
        return date.withDayOfMonth(1);
    }

    public static LocalDate getLastDayOfMonth() {
        return date.plusMonths(1).minusDays(1);
    }
}
