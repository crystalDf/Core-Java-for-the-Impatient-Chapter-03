package ch03.ex01;

public class Ex01 {

    public static void main(String[] args) {

        Employee peter = new Employee("Peter", 100);
        Employee paul = new Employee("Paul", 200);
        Employee mary = new Employee("Mary", 300);

        System.out.println(Employee.average(new Employee[]{peter, paul, mary}));
    }
}

interface Measurable {

    double getMeasure();
}

class Employee implements Measurable {

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
