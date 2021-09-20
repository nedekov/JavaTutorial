package IfElseAssignment;

/*
Write a Java program that gets an integer between 1 and 7 from the user and displays the corresponding name of the weekday.
Print "weekend" if the day is part of the weekend or "workday" if otherwise.

Test Data
Input number: 3
Expected Output :
Wednesday workday
 */

import java.util.Scanner;

public class WeekdayCheck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        int inputNumber = in.nextInt();


            if (inputNumber == 1) {
                System.out.println("Monday Workday");
            } else if (inputNumber == 2) {
                System.out.println("Tuesday Workday");
            } else if (inputNumber == 3) {
                System.out.println("Wednesday Workday");
            } else if (inputNumber == 4) {
                System.out.println("Thursday Workday");
            } else if (inputNumber == 5) {
                System.out.println("Friday Workday");
            } else if (inputNumber == 6) {
                System.out.println("Saturday Weekend");
            } else if (inputNumber == 7)
            {System.out.println("Sunday Weekend");
        }
        else {
            System.out.println("The input number  " + inputNumber + "  is outside of the task range ");}}}