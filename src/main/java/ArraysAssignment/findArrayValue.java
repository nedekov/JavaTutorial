package ArraysAssignment;

//4. Write a Java program to test if an array contains a specific value.

import java.util.Scanner;

public class findArrayValue {
    public static void main (String[] args){

        int[] intArray = new int[]{1, 2, 3, 4, 5,6,7,8,9,10};
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the value you're searching for: ");
        boolean found = false;
        int searchFor = in.nextInt();

        for(int x : intArray){
            if(x == searchFor){
                found = true;
                break;
            }
        }

        System.out.println("The value you've searched for is present in the array: " +found);

}
}
