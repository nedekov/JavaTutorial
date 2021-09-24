package ForLoopAssignment;

/*
Write a program in Java to display the pattern like right angle triangle with a number.

Test Data
Input number of rows : 10
Expected Output :

1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */



public class RightAngleTriangle {


    public static void main(String[] args)

    {
        int i,j,r;

        //number of rows
        r = 10;

        for(i=1;i<=r;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
