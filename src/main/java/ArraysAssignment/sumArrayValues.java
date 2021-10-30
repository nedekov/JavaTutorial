package ArraysAssignment;

//3. Write a Java program to sum values of an array.


public class sumArrayValues {
    public static void main (String[] args){


        int randomArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : randomArray)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}

