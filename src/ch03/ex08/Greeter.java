package ch03.ex08;

public class Greeter implements Runnable {

    private int n;
    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {

        Thread thread = Thread.currentThread();
        String threadName = thread.getName();

        for (int i = 0; i < n; i++) {

            System.out.println(threadName + ": " + target);
        }
    }
}
