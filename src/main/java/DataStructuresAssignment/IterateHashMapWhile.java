package DataStructuresAssignment;

//3. Write a Java Program to iterate HashMap using While and advance for loop and print them.


import java.util.*;

public class IterateHashMapWhile {


    public static void main(String args[]) {

        // Creating the HashMap of keys and values
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("Corona", "Extra");
        hashmap.put("Gin", "Tonic");
        System.out.println("Iterating map using while");

        Set<Map.Entry<String, String>> entrySet1 = hashmap.entrySet();
        Iterator<Map.Entry<String, String>> entrySetIterator = entrySet1.iterator();
        while (entrySetIterator.hasNext()) {
            Map.Entry entry = entrySetIterator.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }

}
