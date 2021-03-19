package lambda;

@FunctionalInterface
public interface FuncInterf {

    public void lambdaMethod();

    default void defMethod() {
        System.out.println("This Is Java 8 DEFAULT Method inside INTERFACE");
    }

    static String statMethod() {
        return "This Is Java 8 STATIC Method inside INTERFACE";
    }

}
