package lambda;

public class LambdaExp1 {

    public static void main(String[] args) {

        System.out.println("First Hello Java8 Lamda Expression");
        //defining SAM with Lambda Expression
        FuncInterf func = () -> System.out.println("Calling First Lambda Expression");
        //Calling Lambda Method
        func.lambdaMethod();

        //Calling Default Method

        func.defMethod();
        //Calling Static Mehtod

        System.out.println(FuncInterf.statMethod());

        //Lambda Expression without mentioning data type while defining-- Type Interference
        FuncInterfAdd funcadd = (a, b) -> System.out.println("Sum of two number is : " + (a + b));
        funcadd.add(5, 6);

        //Lambda Expression without mentioning return type while defining-- Type Interference
        StringLengthInterf sli = s -> s.length();
        System.out.println(sli.getStringLength("Belive Become Achieve"));

    }

}
