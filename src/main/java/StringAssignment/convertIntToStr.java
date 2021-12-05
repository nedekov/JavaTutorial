package StringAssignment;

//6.Write a java program to convert an integer into string. Find two solutions to this problem.

import java.util.Scanner;

public class convertIntToStr {

    public static void main(String args[]) {


        //solution 1
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int myInteger = in.nextInt();


        String converted = String.valueOf(myInteger);
        System.out.println("Here is the converted number: " + converted);

        //solution 2
        System.out.println("Please enter a second number: ");
        int a = in.nextInt();
        String newString = Integer.toString(a);
        System.out.println("Here is the second converted number:" + newString);


    }



}
