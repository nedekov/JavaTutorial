package StringAssignment;

/* 1.Write a java program to compare the size of two strings. */

import java.util.Scanner;

public class compareStrings {

    public static void main(String args[])
    {

        String first,second;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the first string: ");
        first = in.nextLine();
        System.out.print("Please enter the second string: ");
        second = in.nextLine();

        if (first.toLowerCase().compareTo(second.toLowerCase())==0)
            System.out.println("The strings are equal.");
        else {
            System.out.println("The strings are not equal.");
        }
    }
}
