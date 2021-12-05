package StringAssignment;

//3.Write a Java program to create a new String object with the contents of a character array. Use the internet to find a solution.

public class createStringObject {

    public static void main(String args[])
    {

        //solution 1
        char[] charArray = { 'A', 'I', 'L', 'Q', 'K'};
        String str = new String(charArray);
        System.out.println(str);

        //solution 2
        String stringNew = String.copyValueOf(charArray);
        System.out.println(stringNew);

    }
}
