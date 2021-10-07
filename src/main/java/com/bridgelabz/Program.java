package com.bridgelabz;
/*
  @author Ankush
 * @version 16.0
 * since 2021-09-28
 */

public class Program {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.wageCalculation("cognizant", 500, 20,100);
        employeeWage.wageCalculation("capgemini", 800, 10,90);
    }
}
