package StringAssignment;

//4.Write a java program to find out if a char is in a string.

import java.util.Scanner;

public class findCharInString {

    public static void main(String args[]) {

        String target, search;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        target = in.nextLine();
        System.out.print("Please enter the character you're looking for: ");
        search = in.nextLine();

        if(target.toLowerCase().indexOf(search.toLowerCase())!=-1)
        {
            System.out.println( search +" is present in your string");
        }
        else
        {
            System.out.println("there is no \"" + search + "\" character in the provided string");
        }

    }
}
