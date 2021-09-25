package WhileLoopAssignment;

/*
 1. Write a program in Java to display the numbers from 10 to 1 in a reverse order.
 */

public class PrintOut10to1 {

    public static void main(String[] args){
        int i = 10;

        while (i>0){
            System.out.print(i-- +" ");
        }
    }

}
