package ch03.sec03;

public interface Identified {

    default int getId() {
        return Math.abs(hashCode());
    }
}
