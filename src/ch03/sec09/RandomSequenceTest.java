package ch03.sec09;

import java.util.Random;

public class RandomSequenceTest {

    private static Random generator = new Random();

    public static void main(String[] args) {

        System.out.println(randomInts(0, 10).next());
        System.out.println(randomInts2(0, 10).next());
    }

    public static IntSequence randomInts(int low, int high) {

        class RandomSequence implements IntSequence {

            @Override
            public int next() {
                return low + generator.nextInt(high - low + 1);
            }
        }

        return new RandomSequence();
    }

    public static IntSequence randomInts2(int low, int high) {

        return () -> low + generator.nextInt(high - low + 1);
    }
}
