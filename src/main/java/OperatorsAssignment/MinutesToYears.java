package OperatorsAssignment;

/*
Write a Java program to convert minutes into a number of years and days.

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days


 */

import java.util.Scanner;

public class MinutesToYears {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // enter the number of minutes
        System.out.println("Enter the number of minutes:");
        int minutes = input.nextInt();

        // Number of minutes in a year
        // 1Year, 365 days, 52 Weeks, 8760 hours, 525600 minutes, 3153600 seconds
        // 1 day = 1440 minutes

        int year = minutes / 525600;
        int day = minutes / 1440;
        int remainingDays = day % 365;


        System.out.println(minutes + " minutes is approximately " + year + " years and "  +  remainingDays + " days ");
    }



}
