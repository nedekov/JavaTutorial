package StringAssignment;

/* 2.Write a Java program to concatenate a given string to the end of another string. */

import java.util.Scanner;

public class concatenateStrings {

    public static void main(String args[])
    {

        String first,second,concatenated;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the first string: ");
        first = in.nextLine();
        System.out.print("Please enter the second string: ");
        second = in.nextLine();

        //solution 1
        System.out.println("The new string is:" +first +second);

        //solution 2
        concatenated = first.concat(second);
        System.out.println("The new string is:" +concatenated);

        }
    }

