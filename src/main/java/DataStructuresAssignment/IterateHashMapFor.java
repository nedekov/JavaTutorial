package DataStructuresAssignment;

//3. Write a Java Program to iterate HashMap using While and advance for loop and print them.

import java.util.HashMap;
import java.util.Map;

public class IterateHashMapFor {


    public static void main(String[] args) {

        HashMap<String, Integer> items = new HashMap();
        items.put("Beers", 15);
        items.put("Women", 2);
        items.put("Beds", 1);

        for (Map.Entry<String, Integer> pair: items.entrySet()) {
            System.out.println("Key = " + pair.getKey() +
                    ", Value = " + pair.getValue());
        }
    }


}
