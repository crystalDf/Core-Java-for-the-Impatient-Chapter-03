package ch03.sec03;

public class HelloTask implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Hello, World!");
        }
    }

    public static void main(String[] args) {

        Runnable runnable = new HelloTask();

        Thread thread = new Thread(runnable);

        thread.start();
    }
}
