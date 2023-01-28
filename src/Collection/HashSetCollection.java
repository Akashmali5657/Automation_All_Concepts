package Collection;

import java.util.HashSet;

public class HashSetCollection {

    public static void main(String[] args) {
//        HashSet<String> cars = new HashSet<String>();
        HashSet cars = new HashSet();
//        HashSet<String> cars = new HashSet(100,(float) 0.95);
        cars.add("Volvo");
        cars.add("Volvo");
        cars.add(2);
        cars.add("Ford");
        cars.add(8.09);
        cars.add(null);
        cars.add(null);

        System.out.println(cars);
        cars.remove("Ford");
        System.out.println("After removing Element : " + cars);
        System.out.println(cars.contains(null));
        System.out.println(cars.isEmpty());

        //Read objects/elements from hashset using for each loop
        for (Object e:cars) {
            System.out.println(e);
        }


        HashSet<Integer> hs1 = new HashSet<Integer>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        HashSet<Integer> hs2 = new HashSet<Integer>();
        hs2.add(3);
        hs2.add(4);
        hs2.add(5);

        //union
        hs1.addAll(hs2); // provide unic data
        System.out.println("Unic :"+ hs1);

        hs1.retainAll(hs2);// common element
        System.out.println("Retain/common :"+ hs1);

        hs1.removeAll(hs2);
        System.out.println("Difference : " + hs1);

    }

}
