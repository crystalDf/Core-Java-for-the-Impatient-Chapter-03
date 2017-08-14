package ch03.sec05;

public interface Person {

    String getName();

    default int getId() {
        return 0;
    }
}
