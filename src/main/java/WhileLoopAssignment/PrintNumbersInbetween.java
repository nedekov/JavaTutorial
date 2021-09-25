package WhileLoopAssignment;

/*
 2. Write a program in Java to take from the console two numbers and then print out all the numbers between them.
 */

import java.util.Scanner;

public class PrintNumbersInbetween {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number to begin with:");
        int number1 = scan.nextInt();
        System.out.print("Please enter the end number:");
        int number2 = scan.nextInt();

        while (number1<=number2){
            System.out.print(number1 + " ");
            number1++;


    }

}
}
