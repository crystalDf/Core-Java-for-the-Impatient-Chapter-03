package ch03.ex02;

public class Ex02 {

    public static void main(String[] args) {

        Employee peter = new Employee("Peter", 100);
        Employee paul = new Employee("Paul", 200);
        Employee mary = new Employee("Mary", 300);

        Employee largestEmployee =
                (Employee) Employee.largest(new Employee[]{peter, paul, mary});

        System.out.println((largestEmployee != null) ? largestEmployee.getName() : "None");
    }
}
