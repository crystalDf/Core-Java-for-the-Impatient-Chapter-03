package ch03.sec06;

import java.util.function.IntConsumer;

public class RepeatTest {

    public static void main(String[] args) {

//        1st method
        repeat(10, new Runnable() {
            @Override
            public void run() {

                System.out.println("Hello, World!");
            }
        });

        System.out.println();

//        2nd method
        repeat(10, () -> System.out.println("Hello, World!"));

        System.out.println();

        repeat(10, new IntConsumer() {
            @Override
            public void accept(int value) {

                System.out.println("Countdown: " + (9 - value));
            }
        });

        System.out.println();

        repeat(10, value -> System.out.println("Countdown: " + (9 - value)));
    }

    public static void repeat(int n, Runnable action) {

        for (int i = 0; i < n; i++) {

            action.run();
        }
    }

    public static void repeat(int n, IntConsumer action) {

        for (int i = 0; i < n; i++) {

            action.accept(i);
        }
    }
}
