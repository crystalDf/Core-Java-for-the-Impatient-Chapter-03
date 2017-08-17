package ch03.ex01;

public class Employee implements Measurable {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public static double average(Measurable[] objects) {

        double sum = 0;

        for (Measurable measurable : objects) {
            sum += measurable.getMeasure();
        }

        return sum / objects.length;
    }
}
