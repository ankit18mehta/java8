package mehtodReferenes;

public class InterfMain implements Runnable {

    public static void method2() {

        System.out.println("Inside Static Method of InterfMain class");
    }

    public String method3() {
        return "Inside Instance Method of InterfMain Class";
    }

    public void run() {
        try {

            for (int i = 0; i < 20; i++) {
                Thread.sleep(5000);
                System.out.println("Thread Running Inside Run Method");
            }

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Interf i = () -> System.out.println("Lambda Expression for Functional interface");
        i.method1();

        Interf i2 = InterfMain::method2;
        i2.method1();

        InterfMain obj = new InterfMain();
        Interf i3 = obj::method3;
        i3.method1();
        Runnable run1 = () -> {
            try {
                for (int f = 0; f < 5; f++) {
                    System.out.println("Thread Running Inside Lambda Run Method");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        };

        Thread t = new Thread(run1);
        t.start();
        Thread t2 = new Thread(obj::run);
        t2.start();

    }

}
