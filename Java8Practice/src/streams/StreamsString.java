package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsString {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Abcd");
        al.add("Dba");
        al.add("Sad");
        al.add("Abcdef");
        al.add("Abadacd");
        al.add("11");
        al.add("New");

        ArrayList<Integer> intAl = new ArrayList<Integer>();
        intAl.add(10);
        intAl.add(5);
        intAl.add(20);
        intAl.add(1);
        intAl.add(3);
        intAl.add(34);

        Predicate<String> pred = s -> s.charAt(0) == 'A';

        List<String> newList = al.stream().filter(pred).collect(Collectors.toList());
        System.out.println(newList);
        long count = al.stream().filter(pred).count();
        System.out.println(count);
        newList = al.stream().map(f -> f.toUpperCase()).collect(Collectors.toList());
        System.out.println(newList);
        List<String> sortedList = al.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        List<Integer> customSortedList = intAl.stream().sorted((x, y) -> (x > y) ? -1 : (x < y) ? 1 : 0)
                .collect(Collectors.toList());
        System.out.println(customSortedList);

        int min = intAl.stream().min((x, y) -> (x > y) ? 1 : (x < y) ? -1 : 0).get();
        int max = intAl.stream().max((x, y) -> (x > y) ? 1 : (x < y) ? -1 : 0).get();

        System.out.println("Minimum Vaue in Array List  " + min);
        System.out.println("Maximum Vaue in Array List  " + max);

        List<String> customSortedList2 = al.stream().sorted((x, y) -> -x.compareTo(y))
                .collect(Collectors.toList());
        System.out.println(customSortedList2);

    }

}
