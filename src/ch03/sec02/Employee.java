package ch03.sec02;

public class Employee implements Person, Identified {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getId() {
        return Identified.super.getId();
    }
}
