package DataStructuresAssignment;

//1. Write a Java Program to reverse a string without using String inbuilt function reverse().

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]) {
        String initial, reversed="";
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter a string:");
        initial=in.nextLine();
        int length=initial.length();
        for(int i=length-1;i>=0;i--)
            reversed = reversed + initial.charAt(i);

        System.out.println("The reversed string is: "+ reversed);
    }
}

