package ch03.sec07;

public class ThisTest {

    public static void main(String[] args) {

        new ThisTest().doWork();
    }

    public void doWork() {

        Runnable runnableWithoutLambda = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable without Lambda: " + this.getClass().getName());
            }
        };

        Runnable runnableWithLambda =
                () -> System.out.println("Runnable with Lambda: " + this.getClass().getName());

        new Thread(runnableWithoutLambda).start();
        new Thread(runnableWithLambda).start();
    }
}
