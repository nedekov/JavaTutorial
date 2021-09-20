package IfElseAssignment;

/*
Take three numbers from the user and print the greatest number.

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87

 */

import java.util.Scanner;

public class FindGreatestNumber {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first number to be compared:");
        int number1 = scan.nextInt();
        System.out.print("Please enter the second number to be compared:");
        int number2 = scan.nextInt();
        System.out.print("Please enter the third number to be compared:");
        int number3 = scan.nextInt();
        scan.close();
        if (number1 >= number2 && number1 >= number3){
            System.out.print("The first one is the greatest number: " + number1);
        }
        else if (number2 >= number3 && number2 >= number1){
            System.out.print("The second number is the greatest: " + number2);
        }
        else {
            System.out.print("The third number is the greatest: " + number3);
        }

    }



}
