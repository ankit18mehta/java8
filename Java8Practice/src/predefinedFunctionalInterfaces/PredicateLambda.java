package predefinedFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateLambda {

    public static void main(String[] args) {

        Predicate<Integer> predicateLambda = (age) -> {
            if (age > 18)
                return true;
            else
                return false;
        };

        Predicate<Integer> predicateLambda2 = age -> age < 18;

        Predicate<String> predicateLambda3 = s -> s.length() > 5;

        System.out.println(predicateLambda.test(25));

        System.out.println(predicateLambda2.test(25));

        System.out.println(predicateLambda3.test("Predicate"));

    }

}
