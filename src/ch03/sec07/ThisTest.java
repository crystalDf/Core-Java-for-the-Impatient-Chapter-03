package ch03.sec07;

public class ThisTest {

    public static void main(String[] args) {

        new ThisTest().doWork();
    }

    public void doWork() {

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(this.toString());
//            }
//        };

        Runnable runnable = () -> System.out.println(this.toString());

        new Thread(runnable).start();
    }
}
