package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LonkedHashSetCollection {
    public static void main(String args[]) {
        //Create LinkedHashSet object.
        Set linkedHashSet = new LinkedHashSet();

        //Add objects to the LinkedHashSet.
        linkedHashSet.add("Pooja");
        linkedHashSet.add("Rupali");
        linkedHashSet.add("Prince");
        linkedHashSet.add("Rachna");
        linkedHashSet.add(null);
        linkedHashSet.add("Rachna");
        linkedHashSet.add("Rinku");
        linkedHashSet.add(null);

        //Print the LinkedHashSet object.
        System.out.println("LinkedHashSet elements:");
        System.out.println(linkedHashSet);

        //Print the LinkedHashSet elements using iterator.
        Iterator iterator = linkedHashSet.iterator();
        System.out.println("LinkedHashSet elements " +
                "using iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
