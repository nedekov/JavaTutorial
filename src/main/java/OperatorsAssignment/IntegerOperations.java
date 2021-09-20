package OperatorsAssignment;

/*
Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the max and the min.

Test Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5
 */


import java.util.Scanner;

public class IntegerOperations {

        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            // enter first integer
            System.out.println("Enter the first number:");
            int firstInt = input.nextInt();
            // enter second integer
            System.out.println("Enter the second number:");
            int secondInt = input.nextInt();

            int sum = firstInt + secondInt;
            int diff = firstInt - secondInt;
            int prod = firstInt*secondInt;
            int avg = sum / 2;
            //int dist =
            int max = Math.max(firstInt,secondInt);
            int min = Math.min(firstInt,secondInt);



            System.out.println("Sum of two integers: " + sum) ;
            System.out.println("Difference of two integers: " + diff);
            System.out.println("Product of two integers: " + prod) ;
            System.out.println("Average of two integers: " + avg);
           // System.out.println("Distance of two integers: ");
            System.out.println("Max integer: " + max);
            System.out.println("Min integer: " + min);


}}
