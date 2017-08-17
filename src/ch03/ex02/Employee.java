package ch03.ex02;

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

    public String getName() {
        return name;
    }

    public static double average(Measurable[] objects) {

        double sum = 0;

        for (Measurable measurable : objects) {
            sum += measurable.getMeasure();
        }

        return sum / objects.length;
    }

    public static Measurable largest(Measurable[] objects) {

        Measurable largestMeasurable = null;
        double largest = 0;

        for (Measurable measurable : objects) {

            double measure = measurable.getMeasure();

            if(largest < measure) {
                largestMeasurable = measurable;
                largest = measure;
            }
        }

        return largestMeasurable;
    }
}
