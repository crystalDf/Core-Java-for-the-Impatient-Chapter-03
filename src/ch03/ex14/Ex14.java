package ch03.ex14;

import java.util.Arrays;
import java.util.Comparator;

public class Ex14 {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        for (int i = 0; i < 10; i++) {

            employees[i] = new Employee("A" + i, 10000 % (i + 1));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(employees[i]);
        }

        System.out.println();

        Arrays.sort(employees, Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getName));

        for (int i = 0; i < 10; i++) {
            System.out.println(employees[i]);
        }

        System.out.println();

        Arrays.sort(employees, Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())
                .thenComparing(Employee::getName, Comparator.reverseOrder()));

        for (int i = 0; i < 10; i++) {
            System.out.println(employees[i]);
        }
    }
}
