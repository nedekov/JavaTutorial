package DoWhileLoopAssignment;

//1. Write a program in Java to display the numbers from 10 to 1 in a reverse order.


public class PrintReverseFromTen
{
    public static void main(String[] args) {
        int i=10;
        do{
            System.out.println(i);
            i--;
        }while(i>0);
    }
}
