package ArraysAssignment;

//5. Write a Java program to reverse an array of integer values.

import java.util.Arrays;
import java.util.Collections;

public class reverseIntArray {


        static void reverse(Integer a[])
        {
            Collections.reverse(Arrays.asList(a));
            System.out.println(Arrays.asList(a));
        }

        public static void main(String[] args)
        {
            Integer [] arr = {1, 2, 3, 4, 5};
            reverse(arr);
        }
}
