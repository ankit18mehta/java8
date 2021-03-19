package lambda;

public class LambdaThread {

    public static void main(String[] args) {

        Runnable runnableThread = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Child Thread");
            }
        };

        Thread myThread = new Thread(runnableThread);
        myThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");

        }
    }

}
