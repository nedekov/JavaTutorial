package ArraysAssignment;


/* 1. Write a Java program to sort an integer array in ascending and then print it. */

import java.util.Arrays;


public class sortArrayAscending2 {
    public static void main (String[] args){

        int [] numbers = {9,6,3,4,1,5};
        Arrays.sort(numbers);    //Sorts the Array in Ascending Order

        System.out.printf("Sorted arr[] : %s",
                Arrays.toString(numbers));   //Prints the sorted Array
    }
}


