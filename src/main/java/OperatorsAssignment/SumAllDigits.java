package OperatorsAssignment;

/*

 3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
 */

import java.util.Scanner;

public class SumAllDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // Create new Scanner object

        // enter a number between 0 and 1000.
        System.out.print("Input a number between 0 and 1000: ");
        int number = input.nextInt();

        // Compute the sum of the digits in the integer.
        int lessThan10 = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + lessThan10;

        // Display results
        System.out.println("The sum of the digits is " + sum);
    }


}
