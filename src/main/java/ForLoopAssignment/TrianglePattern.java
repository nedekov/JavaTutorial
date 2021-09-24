package ForLoopAssignment;

/*
Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.
The pattern is as follows:

1
22
333
4444
 */

public class TrianglePattern {

    public static void main(String[] args)

    {
        int i,j,r;

        //number of rows
        r = 4;

        for(i=1;i<=r;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(i);

            System.out.println("");
        }
    }
}
