package collectionsLambda;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsLambda {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(5);
        al.add(20);
        al.add(1);
        al.add(3);
        al.add(34);

        System.out.println("Without Sorting " + al);
        Collections.sort(al, (obj1, obj2) -> {
            return (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0;
        });
        System.out.println("After Sorting " + al);

    }

}
