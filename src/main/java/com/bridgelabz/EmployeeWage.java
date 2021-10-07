package com.bridgelabz;

import java.util.*;

public class EmployeeWage {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;


    public static void wageCalculation(){
        int totalHr=0;
        Random num= new Random();
        int attendance= num.nextInt(2);
        switch (attendance){
            case isFullTime:
                System.out.println("Employee is present");
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }

}
