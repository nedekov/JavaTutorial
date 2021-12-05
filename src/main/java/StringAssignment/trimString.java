package StringAssignment;

//5.Write a java program to remove all the white spaces in a given string and print it out.

import java.util.Scanner;

public class trimString {

    public static void main(String args[]) {

        String myString;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        myString = in.nextLine();

        String trimmedString = myString.replaceAll("\\s", "");

        System.out.print("Here you have the new trimmed string: " + trimmedString);

    }

}
