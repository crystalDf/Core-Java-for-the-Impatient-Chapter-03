package ch03.ex15;

import java.util.Random;

public class Ex15 {

    private static Random generator = new Random();

    public static void main(String[] args) {

        System.out.println(randomInts(0, 10).next());
    }

    public static IntSequence randomInts(int low, int high) {

        return new RandomSequence(low, high);
    }

    public static class RandomSequence implements IntSequence {

        private int low;
        private int high;

        public RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        @Override
        public int next() {
            return low + generator.nextInt(high - low + 1);
        }
    }
}
