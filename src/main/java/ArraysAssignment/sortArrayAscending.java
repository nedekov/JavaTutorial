package ArraysAssignment;

/* 2. Find a second way to sort a numeric array from internet and realize it in a Java program. */

public class sortArrayAscending {

    public static void main (String[] args){
        int [] numbers = {9,6,3,4};
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }


        System.out.println("Sorted array in ascending order: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");




        }


}
}
