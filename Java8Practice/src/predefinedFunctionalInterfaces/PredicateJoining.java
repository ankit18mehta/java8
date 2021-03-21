package predefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String[] args) {

        Predicate<Integer> numGreater = (num) -> num > 10;
        Predicate<Integer> numEven = (num) -> num % 2 == 0;
        System.out.println(numEven.and(numGreater).test(21));
        System.out.println(numEven.or(numGreater).test(21));
        System.out.println(numEven.negate().test(21));

        ArrayList<String> al = new ArrayList<String>();
        al.add("Abcd");
        al.add("Dba");
        al.add("Sad");
        al.add("Abcdef");
        al.add("Abadacd");
        al.add("11");
        al.add("New");

        Predicate<String> listPredicate = s -> s.charAt(0) == 'A';

        for (Iterator iterator = al.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            if (listPredicate.test(string))
                System.out.println(string);

        }

    }

}
