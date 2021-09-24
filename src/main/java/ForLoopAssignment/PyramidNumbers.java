package ForLoopAssignment;

/*
 Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.

       1
      2 2
     3 3 3
    4 4 4 4
 */

public class PyramidNumbers {

    public static void main(String[] args){

    int Rows = 4;
    int rowCount = 1;


        for (int i = Rows; i > 0; i--)
    {

        for (int j = 1; j <= i; j++)
        {
            System.out.print(" ");
        }

        for (int j = 1; j <= rowCount; j++)
        {
            System.out.print(rowCount+" ");
        }

        System.out.println();


        rowCount++;
    }
}
}
