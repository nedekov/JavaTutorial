package DataStructuresAssignment;

//4. Write a Java Program to find whether a string or number is palindrome or not.

import java.util.Scanner;

public class PalindromeOrNot {

    public static void main(String args[])
    {
        String inputString, reversedString = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a word to be checked:");
        inputString = sc.nextLine();

        int length = inputString.length();

        for ( int i = length - 1; i >= 0; i-- )
            reversedString = reversedString + inputString.charAt(i);

        if (inputString.equals(reversedString))
            System.out.println(inputString+" is a palindrome");
        else
            System.out.println(inputString+" is not a palindrome");

    }
}
