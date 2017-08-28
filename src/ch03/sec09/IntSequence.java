package ch03.sec09;

public interface IntSequence {

    default boolean hasNext() {
        return true;
    }

    int next();
}
