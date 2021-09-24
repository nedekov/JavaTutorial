package ForLoopAssignment;

/*
Write a program in Java to display the pattern like a diamond.
Test Data
Input number of rows (half of the diamond) : 7
Expected Output :


      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */

public class DiamondPattern {

    public static void main(String args[])
    {

        int numberOfRows, c, i, printSpace;

        numberOfRows = 6 ;
        printSpace = numberOfRows-1;

        for(i=1; i<=numberOfRows; i++)
        {
            for(c=1; c<=printSpace; c++)
            {
                System.out.print(" ");
            }
            printSpace--;
            for(c=1; c<=(2*i-1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        printSpace = 1;

        for(i=1; i<=(numberOfRows-1); i++)
        {
            for(c=1; c<=printSpace; c++)
            {
                System.out.print(" ");
            }
            printSpace++;
            for(c=1; c<=(2*(numberOfRows-i)-1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
