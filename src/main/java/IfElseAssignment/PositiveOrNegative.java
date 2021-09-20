package IfElseAssignment;
import java.util.Scanner;

/*Write a Java program to get a number from the user and print whether it is positive or negative.

         Test Data
         Input number: 35
         Expected Output :
         Number is positive
*/

public class PositiveOrNegative {

    public static void main(String[] args)
    {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number to be checked:");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println( "Number " + number + " is positive ");
        }
        else if(number < 0)
        {
            System.out.println("Number " + number + " is negative ");
        }
        else
        {
            System.out.println("Number " + number + " is neither positive nor negative");
        }
    }
}

