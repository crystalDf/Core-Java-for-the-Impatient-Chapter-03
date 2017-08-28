package ch03.ex13;

import java.util.ArrayList;
import java.util.List;

public class Ex13 {

    public static void main(String[] args) {

        List<Greeter> runInOrderGreeters = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            Greeter greeter = new Greeter(1, "Hello " + i + ". Run in order.");
            runInOrderGreeters.add(greeter);
        }

        Runnable runnable = runInOrder(
                runInOrderGreeters.toArray(new Runnable[runInOrderGreeters.size()]));

        new Thread(runnable).start();
    }

    public static Runnable runInOrder(Runnable[] runnables) {

        return () -> {

            for (Runnable runnable : runnables) {
                runnable.run();
            }
        };
    }
}
