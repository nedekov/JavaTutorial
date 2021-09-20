package SwitchCaseAssignment;

/*
Write a Java program that asks the user to input a letter grade (A-F) and displays the name of the grade.

Test Data
Please enter a grade: A
Expected Output :
Excellent!
 */

import java.util.Scanner;

/*
9.5–10 	A 	Excellent
9.0–9.4 	B 	Outstanding
8.0–8.9 	C 	Very good credit rating
6.5–7.9 	D 	Sufficient
5.1–6.4 	E 	Failing grade with recovery option or supplementary examination
1.0–5.0 	F 	Fail automatically
 */
public class CheckGrade
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a grade: ");
        char grade = in.next().charAt(0);


        switch (grade)
        {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Outstanding");
                break;
            case 'C':
                System.out.println("Very good");
                break;
            case 'D':
                System.out.println("Sufficient");
                break;
            case 'E':
                System.out.println("Failing grade with recovery option or supplementary examination");
                break;
            case 'F':
                System.out.println("Fail");
                break;

            default:
                System.out.print("You have entered an invalid grade");

        }
    }
}