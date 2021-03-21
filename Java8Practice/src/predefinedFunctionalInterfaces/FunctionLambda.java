package predefinedFunctionalInterfaces;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionLambda {

    public static void main(String[] args) {
        Function<Integer, Integer> func = num -> num + 10;
        Function<Integer, Integer> func2 = num -> num * 100;
        System.out.println(func.apply(100));

        System.out.println(func.andThen(func2).apply(100));
        System.out.println(func.compose(func2).apply(100));

        ToIntFunction<String> s = z -> z.length();
        System.out.println(s.applyAsInt("Ankit"));

    }

}
