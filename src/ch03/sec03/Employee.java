package ch03.sec03;


public class Employee implements Person, Identified, Comparable<Employee> {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getId() {
        return Identified.super.getId();
    }


    @Override
    public int compareTo(Employee o) {
        return getId() - o.getId();
    }
}
