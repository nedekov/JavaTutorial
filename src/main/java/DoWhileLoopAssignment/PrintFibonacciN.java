package DoWhileLoopAssignment;

//2. Write a program in Java to display the first n  Fibonacci numbers.
// N should be input from the console.

import java.util.Scanner;

public class PrintFibonacciN {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the desired range of Fibonacci numbers: ");
        //number of iterations
        int n = in.nextInt();

        int i = 1, firstNumber = 0, secondNumber = 1;

       do {
            System.out.print(firstNumber + "  ");
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            i++;
        }
        while (i <= n);
    }
}