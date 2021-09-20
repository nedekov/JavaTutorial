package OperatorsAssignment;

public class ReadTemperature {


/*
1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
T(oC)   =  ((T(oF)  -  32  ) ×  5)/9
*/


    public static void main(String args[])
    { float Fahrenheit, Celsius;
        Fahrenheit = 212;
        Celsius  = ((Fahrenheit-32)*5)/9;
        System.out.println("Temperature in Celsius is: "+Celsius);
    }
}


