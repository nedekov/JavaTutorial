package WhileLoopAssignment;

/*
 4.Write a program in Java to start printing all the numbers between 1 and 10 but stop printing at 5.

Test Data
Expected Output :

1
12
123
1234
12345
 */

public class PrintNumbersButStopAtFive {

    public static void main(String[] args){

        {
            int a = 1;
            int rows = 10;

            while(a <= rows)
            {
                int b = 1;
                while(b <= a)
                {
                    System.out.print(b);
                    b++;
                }
                if (a ==5){
                    break;
                }
                System.out.println();
                a++;
            }
        }
}}

