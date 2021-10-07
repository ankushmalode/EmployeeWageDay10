package com.bridgelabz;

import java.util.*;

public class EmployeeWage {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;
    public static int totalWorkingDay;

    public static void wageCalculation(String company, int empRatePerHr, int workingDayPerMonth, int maxPerHrMonth) {
        int totalHr = 0, fullDayHr = 8, partTimeWage = 4;
        while (totalWorkingDay < workingDayPerMonth && totalHr < maxPerHrMonth) {
            Random num = new Random();
            int attendance = num.nextInt(3);
            switch (attendance) {
                case isFullTime:
                    totalHr += fullDayHr;
                    break;
                case isPartTime:
                    totalHr += partTimeWage;
                    break;
                default:
                    totalHr = 0;
                    totalWorkingDay--; /*if employee is absent the then
                     * day also not to be count.
                     */
                    break;
            }
            totalWorkingDay++;
        }
        System.out.println("Total working days per month is " + totalWorkingDay);
        System.out.println("In " + company + " per month employee wage is " + totalHr * empRatePerHr+"\n");
    }
}
