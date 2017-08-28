package ch03.ex09;

import java.util.ArrayList;
import java.util.List;

public class Ex09 {

    public static void main(String[] args) {

        List<Greeter> runTogetherGreeters = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            Greeter greeter = new Greeter(1, "Hello " + i + ". Run together.");
            runTogetherGreeters.add(greeter);
        }

        List<Greeter> runInOrderGreeters = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            Greeter greeter = new Greeter(1, "Hello " + i + ". Run in order.");
            runInOrderGreeters.add(greeter);
        }

        runTogether(runTogetherGreeters.toArray(new Runnable[runTogetherGreeters.size()]));
        runInOrder(runInOrderGreeters.toArray(new Runnable[runInOrderGreeters.size()]));
    }

    public static void runTogether(Runnable... tasks) {

        for (Runnable runnable : tasks) {
            new Thread(runnable).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {

        for (Runnable runnable : tasks) {
            runnable.run();
        }
    }
}
