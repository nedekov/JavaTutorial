package WhileLoopAssignment;

/*
 3.Write a program in Java to print all the numbers between 1 and 10 with the exception of 3 and 5.
 */

public class PrintAllNumbersButThreeAndFive {


    public static void main(String[] args){
        int i = 0;

        while (i <10)
        {
            if (i==3)
            {
                i++;
                continue;
            }
            if (i==5)
            {
                i++;
                continue;
            }

            System.out.print(i+" ");
            i++;
        }
    }

}
