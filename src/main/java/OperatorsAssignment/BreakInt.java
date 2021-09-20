package OperatorsAssignment;
/*
 7. Write a Java program to break an integer into a sequence of individual digits.

Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
 */


import java.util.Scanner;

public class BreakInt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=  input.nextInt();
        String number = String.valueOf(num);
        String first = number.substring(0,  1);
        String second = number.substring(1, 2);
        String third = number.substring(2, 3);
        String fourth = number.substring(3, 4);
        String fifth = number.substring(4, 5);
        String sixth = number.substring(5, 6);


        System.out.println(first + " " +second + " " + third + " " + fourth + " " + fifth + " " + sixth);



        }

    }
