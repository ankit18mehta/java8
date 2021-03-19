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
    }

}
