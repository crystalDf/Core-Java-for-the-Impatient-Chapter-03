package ch03.sec04;

public class HelloTask implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Hello, World!");
        }
    }

    public static void main(String[] args) {

        Runnable runnable;

//        1st method
        runnable = new HelloTask();

//        2nd method
        runnable = () -> {

            for (int i = 0; i < 10; i++) {

                System.out.println("Hello, World!");
            }
        };

        Thread thread = new Thread(runnable);

        thread.start();
    }
}
