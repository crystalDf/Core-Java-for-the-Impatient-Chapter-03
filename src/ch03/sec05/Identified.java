package ch03.sec05;

public interface Identified {

    default int getId() {
        return Math.abs(hashCode());
    }
}
