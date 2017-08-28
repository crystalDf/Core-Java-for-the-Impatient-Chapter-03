package ch03.ex04;

public interface IntSequence {

    default boolean hasNext() {
        return true;
    }

    int next();

    static IntSequence of(int... numbers) {
        return new IntSequence() {

            private int i = 0;

            @Override
            public int next() {
                return numbers[i++];
            }

            @Override
            public boolean hasNext() {
                return i < numbers.length;
            }
        };
    }
}