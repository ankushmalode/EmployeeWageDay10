package com.bridgelabz;

import java.util.*;

public class EmployeeWage {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;


    public static void wageCalculation() {
        int totalHr = 0, fullDayHr = 8, wagePerHr = 20;
        Random num = new Random();
        int attendance = num.nextInt(2);
        switch (attendance) {
            case isFullTime:
                System.out.println("Employee is present");
                totalHr = fullDayHr;
                break;
            default:
                System.out.println("Employee is Absent");
                totalHr = 0;
                break;
        }

        System.out.println("Full day employee wage is " + totalHr * wagePerHr);
    }
}
