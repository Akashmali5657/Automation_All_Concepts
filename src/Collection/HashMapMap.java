package Collection;

import java.util.HashMap;

public class HashMapMap {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<Integer,String> people = new HashMap<Integer,String>();


        // Add keys and values (Name, Age)
        people.put(1, "John");
        people.put(2, "Steve");
        people.put(3, "Angie");
        people.put(3, "aa");

        for (Integer i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
        System.out.println("get value :" + people.get(3));
        people.remove(1);
        System.out.println("After removing value :" + people);
        System.out.println("contains key :" + people.containsKey(1));
        System.out.println("contains value :" + people.containsValue("aa"));
        System.out.println("Is empty :" + people.isEmpty());

        System.out.println("Set keys :" + people.keySet());
        System.out.println("Set values :" + people.values());
        System.out.println("entry set value :" + people.entrySet());


    }
}
