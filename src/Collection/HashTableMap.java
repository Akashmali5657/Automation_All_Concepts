package Collection;

import java.util.Hashtable;

public class HashTableMap {

    public static void main(String[] args){
//    HashTable ht=new HashTable();

    Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        ht.put(101, "John");
        ht.put(102, "David");
        ht.put(106,"aaa");
        ht.put(103, "Smith");
        ht.put(104, "Akash");

        System.out.println("Original : " +ht);

        ht.remove(103);
        System.out.println("After removing 103 : " +ht);
        System.out.println("contains key: "+ ht.containsKey(103));
        System.out.println("contains value: "+ ht.containsValue("Akash"));
        System.out.println("is empty : "+ ht.isEmpty());

        System.out.println("Set keys :" + ht.keySet());
        System.out.println("Set values :" + ht.values());
        System.out.println("entry set value :" + ht.entrySet());

        for (Integer i : ht.keySet()) {
            System.out.println(i + " : " + ht.get(i));
//            System.out.println("key: " + i + " value: " + ht.get(i));
        }
    }
}
