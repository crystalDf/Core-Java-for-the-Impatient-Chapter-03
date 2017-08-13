package ch03.sec04;

public class HelloTask implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Hello, World!");
        }
    }

    public static void main(String[] args) {

//        1st method
//        Runnable runnable = new HelloTask();

//        2nd method
        Runnable runnable = () -> {

            for (int i = 0; i < 10; i++) {

                System.out.println("Hello, World!");
            }
        };

        Thread thread = new Thread(runnable);

        thread.start();
    }
}
