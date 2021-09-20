package OperatorsAssignment;

/*
2. Write a Java program that reads a number in inches, converts it to meters.
        Note: One inch is 0.0254 meter.
        Test Data
        Input a value for inch: 1000
        Expected Output :
        1000.0 inch is 25.4 meters
public class ReadNumber
*/

public class ConvertNumber {


    public static void main(String[] args)
    { double Inches;
        double Meters;
        Inches = 1000 ;
        Meters = Inches * (0.0254);
        System.out.println(Inches + " Inches are:" + Meters + " Meters");


    }

}