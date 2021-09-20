package SwitchCaseAssignment;

/*
Write a Java program that keeps a integer number from the user between 1 and 7 and displays the name of the weekday.
Print "Weekend" if the day is part of the weekend or "Workday" if otherwise.

Test Data
Input number: 3
Expected Output :
Wednesday is a Workday
public class WeekdayOrWeekend {
}
*/


import java.util.Scanner;

public class WeekdayOrWeekend
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number corresponding to a day of the week: ");
        int day = in.nextInt();


        switch (day)
        {
            case 1:
                System.out.println("Monday is a workday");
                break;
            case 2:
                System.out.println("Tuesday is a workday");
                break;
            case 3 :
                System.out.println("Wednesday is a workday");
                break;
            case 4 :
                System.out.println("Thursday is a workday");
                break;
            case 5 :
                System.out.println("Friday is a workday");
                break;
            case 6 :
                System.out.println("Saturday is a part ot the Weekend");
                break;
            case 7 :
                System.out.println("Sunday is a part of the Weekend");
                break;

            default:
                System.out.print("The input number  " + day + "  is outside of the task range ");

        }
    }
}