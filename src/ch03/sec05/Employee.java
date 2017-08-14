package ch03.sec05;


public class Employee implements Person, Identified, Comparable<Employee> {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

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
