package ch03.ex05;

public interface IntSequence {

    default boolean hasNext() {
        return true;
    }

    int next();

    static IntSequence constant(int number) {
        return () -> number;
    }
}