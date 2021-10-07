package com.bridgelabz;

import java.util.*;

public class EmployeeWage {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;


    public static void wageCalculation() {
        int totalHr = 0, fullDayHr = 8, partTimeWage = 4, wagePerHr = 20, totalWorkingDay = 0, workingDayPerMonth = 20, maxPerHrMonth = 100;
        while (totalWorkingDay < workingDayPerMonth && totalHr < maxPerHrMonth) {
            Random num = new Random();
            int attendance = num.nextInt(3);
            switch (attendance) {
                case isFullTime:
                    totalHr += fullDayHr;
//                    if (totalHr > 100)
//                        totalHr -= fullDayHr;
                    break;
                case isPartTime:
                    totalHr += partTimeWage;
//                    if (totalHr > 100)
//                        totalHr -= partTimeWage;
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
        System.out.println("Full day employee wage is " + totalHr * wagePerHr);
    }
}
