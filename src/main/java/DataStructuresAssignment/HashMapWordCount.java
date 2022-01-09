package DataStructuresAssignment;

//2. Write a Java Program to count the number of words in a string using HashMap.

import java.util.*;

public class HashMapWordCount {

    public static void main(String args[]) {

        Map<String, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string:");

        String sentence = sc.nextLine();

        // splitting the string based on space
        String[] tokens = sentence.split(" ");

        for (String token : tokens) {

            String word = token.toLowerCase();

            if (map.containsKey(word)) {

                // getting the word count
                int count = map.get(word);
                // overriding the word count
                map.put(word, count + 1);

            } else {

                map.put(word, 1); // initial word count to 1

            }

        }



        Set<String> keys = map.keySet(); // list of unique words (Set)

        TreeSet<String> sortedKeys = new TreeSet<>(keys); // ascending word order

        for (String str : sortedKeys) {

            System.out.println("Word =" + str + " and it's count = " + map.get(str));

        }
    }
}
