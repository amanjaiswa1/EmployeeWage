package com.assignments.day3.EmployeeWage;

import java.util.*;

public class EmployeeWageCalculation {
	    public final static int fullTime = 1;
	    public final static int partTime = 2;
	    
	    public static void calculateEmployeeWage(String companyName, int wagePerHour, int workingDaysPerMonth, int totalWorkingHour) {
	        System.out.println( companyName+ " Employee Wage Computation :");
	        int totalEmployeeWorkHour = 0;
	        int dayCount = 0;
	        int workingHours;
	        Random ran = new Random();
	        
	        while (dayCount < workingDaysPerMonth && totalEmployeeWorkHour <= totalWorkingHour) {
	        	dayCount++ ;
	        	int attendance = ran.nextInt(3);
	            switch (attendance) {
	                case fullTime : {
	                    workingHours = 8;break;
	                }
	                case partTime : {
	                    workingHours = 4;break;
	                }
	                default : workingHours = 0;break;
	            }
	            int wage = workingHours * wagePerHour;
	            System.out.println("Day "+dayCount+" Work Hour : "+workingHours+" & Wage : "+wage);
	            totalEmployeeWorkHour += workingHours;
	        }
	        int totalEmployeeWage = totalEmployeeWorkHour * wagePerHour;
	        System.out.println("\nTotal Monthly Wage of Employee is: "+totalEmployeeWage);
	        System.out.println("Total Working Hours are: "+totalEmployeeWorkHour);
	        System.out.println("------------------------------------------ \n");
	    }
	    public static void main(String[] args) {
	    	System.out.println(":: Welcome to Employee Wage Computation Program ::\n");
	        calculateEmployeeWage("Company One",20,20,100);
	        calculateEmployeeWage("Company Two",25,22,120);
	        calculateEmployeeWage("Company Three",30,26,150);
	    }
  }

