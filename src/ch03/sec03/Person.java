package ch03.sec03;

public interface Person {

    String getName();

    default int getId() {
        return 0;
    }
}
