package practice;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
//        ArrayList<Integer> rv=new ArrayList<>();
//        rv.add(1);
//        rv.add(4);
//        rv.add(5);
//        rv.add(6);
//        rv.add(8);
//        rv.add(10);
//
//        System.out.println("Array list contains:"+ rv);
//        System.out.println(rv.size());
//        System.out.println("Replace element:"+rv.set(5,11) +"after replaced" + rv);
//        System.out.println(rv.indexOf(4));
//        System.out.println(rv.lastIndexOf(11));
//        System.out.println(rv.contains(6));
//
//        LinkedList<Integer> rv1=new LinkedList<>();
//        rv1.add(1);
//        rv1.add(4);
//        rv1.add(5);
//        rv1.add(6);
//        rv1.add(8);
//        rv1.add(10);
//
//        System.out.println("Array list contains:"+ rv1);
//        System.out.println(rv1.size());
//        System.out.println("Replace element:"+rv1.set(5,11) +"after replaced" + rv1);
//        System.out.println(rv1.indexOf(4));
//        System.out.println(rv1.lastIndexOf(11));
//        System.out.println(rv1.contains(6));
//
//        rv1.addFirst(100);
//        rv1.addLast(100);
//        System.out.println(rv1.getFirst());
//        System.out.println(rv1.getLast());


        /*//Vector
        Vector<Integer> rv2=new Vector<>();
        rv2.add(1);
        rv2.add(4);
        rv2.add(5);
        rv2.add(6);
        rv2.add(8);
        rv2.add(6);
        rv2.add(8);
        rv2.add(10);
        rv2.add(5);
        rv2.add(6);
        rv2.add(8);
        rv2.add(6);
        rv2.addElement(100);

        rv2.addElement(101);
        System.out.println(rv2);
        System.out.println(rv2.firstElement());
        System.out.println(rv2.lastElement());
        System.out.println("capacity:"+ rv2.capacity());
        System.out.println(rv2.hashCode());
        rv2.insertElementAt(2,1);
        System.out.println(rv2);

//        for (Object i:rv2) {
//            System.out.println("Elements : " +i);
//        }

        for (int i=0;i<rv2.size();i++){
            System.out.println(i + " Element is: "+ rv2.get(i));
        }*/

        //HashSet

        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(5);

        System.out.println(hs);
        System.out.println(hs.remove(5));
        hs.add(5);

        System.out.println(hs.isEmpty());
        System.out.println(hs.hashCode());

        List<Integer> list = new ArrayList<Integer>(hs);

        System.out.println(list.get(1));

        for (Object i:hs) {
            System.out.println(i);
        }
    }
}
