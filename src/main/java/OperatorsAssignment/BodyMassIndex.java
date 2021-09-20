package OperatorsAssignment;

/*
 Write a Java program to compute body mass index (BMI).

Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721
 */


import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        // enter weight in pounds
        System.out.println("Enter your weight in pounds:");
        // convert weight in kgs
        double weight = (input.nextDouble()*0.453592);

        // enter height in inches
        System.out.println("Enter your height in inches:");
        // Convert  height from inches to meters
        double height = (input.nextInt()*0.0254);

        //Calculate Body Mass Index.

        double bmi = weight / (height*height)   ;


        System.out.println("Your Body Mass Index is: " + bmi);


    }

}
