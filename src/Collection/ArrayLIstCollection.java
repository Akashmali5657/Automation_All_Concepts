package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLIstCollection {

    public static void main(String[] args) {

        //Declare ArrayList
//        ArrayList<String> cars = new ArrayList<String>(); // To store String
//        ArrayList<Integer> myNum = new ArrayList<Integer>(); // To store Numbers
        ArrayList addAnyTypeOfData = new ArrayList(); // To store String

        addAnyTypeOfData.add("Volvo");
        addAnyTypeOfData.add("BMW");
        addAnyTypeOfData.add("Ford");
        addAnyTypeOfData.add("Mazda");
        addAnyTypeOfData.add(3);
        addAnyTypeOfData.add(9.6);
        addAnyTypeOfData.add(true);

        System.out.println(addAnyTypeOfData);//[Volvo, BMW, Ford, Mazda, 3, 9.6, true]

        System.out.println("No of elements is arralist: "+ addAnyTypeOfData.size());// 7

        addAnyTypeOfData.remove(3);// it will remove "Mazda"
        System.out.println("after removing No of elements is arralist: "+ addAnyTypeOfData.size());// 6

        addAnyTypeOfData.add(2,"New Added");
        System.out.println("After adding New: "+ addAnyTypeOfData);//After adding New: [Volvo, BMW, New Added, Ford, 3, 9.6, true]

        addAnyTypeOfData.set(6,false);
        System.out.println("After set New: "+ addAnyTypeOfData); //After set New: [Volvo, BMW, New Added, Ford, 3, 9.6, false]

        System.out.println("Using contains method: "+ addAnyTypeOfData.contains("New Added")); //true
        System.out.println("is empty: "+ addAnyTypeOfData.isEmpty()); //false


        // for loop
//        System.out.println("Reading using for loop");
//
//        for (int i=0; i<addAnyTypeOfData.size();i++){
//            System.out.println(addAnyTypeOfData.get(i));
//        }

        // for each loop
//        System.out.println("Reading using for each loop");
//        for (Object f:addAnyTypeOfData){
//            System.out.println(addAnyTypeOfData);
//        }

        //iterator
        System.out.println("Iterator loop");
        Iterator it = addAnyTypeOfData.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        ///addAdd method
        ArrayList<Integer> myNum = new ArrayList<Integer>(); // To store Numbers

        myNum.add(1);
        myNum.add(13);
        myNum.add(91);
        myNum.add(16);

        ArrayList<Integer> dup_MyNum = new ArrayList<Integer>(); // To store Numbers
        dup_MyNum.addAll(myNum);
        System.out.println("Add All method used: "+ dup_MyNum);
        dup_MyNum.removeAll(myNum);
        System.out.println("remove All method used: "+ dup_MyNum);
        Collections.sort(myNum);
        System.out.println("sort :"+ myNum);
        Collections.sort(myNum,Collections.reverseOrder());
        System.out.println("sort reverse:"+ myNum);

    }
}
