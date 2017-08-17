package ch03.ex01;

public class Ex01 {

    public static void main(String[] args) {

        Employee peter = new Employee("Peter", 100);
        Employee paul = new Employee("Paul", 200);
        Employee mary = new Employee("Mary", 300);

        System.out.println(Employee.average(new Employee[]{peter, paul, mary}));
    }
}
