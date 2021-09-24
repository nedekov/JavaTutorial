package SwitchCaseAssignment;

/*
Write a Java program that asks the user to input choice in y/n and displays the output according to value input by user.

Test Data
Enter Y or N: Y
Expected Output :
You entered Y.
 */

import java.util.Scanner;

public class Y_or_N {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter Yes (y) or No (n): ");
        char answer = in.next().charAt(0);


        switch (answer)
        {
            case 'y':
            case 'Y':
                System.out.println("You entered YES");
                break;
            case 'n' :
                System.out.println("You entered NO");
                break;
            default:
                System.out.print("You have entered an invalid answer");


        }



    }
}
