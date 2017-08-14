package ch03.sec05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class ConstructorReferences {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Peter", "Paul", "Mary");

//        1st method
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                new Employee(s);
            }
        });

//        2nd method
        names.forEach(s -> new Employee(s));

//        3rd method
        names.forEach(Employee::new);

//        4th method
        Stream<Employee> stream;

        stream = names.stream().map(Employee::new);

        Object[] objects = stream.toArray();

        Employee[] employees;

        stream = names.stream().map(Employee::new);

//        1st method
        employees = stream.toArray(new IntFunction<Employee[]>() {
            @Override
            public Employee[] apply(int value) {
                return new Employee[value];
            }
        });

        stream = names.stream().map(Employee::new);

//        2nd method
        employees = stream.toArray(n -> new Employee[n]);

        stream = names.stream().map(Employee::new);

//        3rd method
        employees = stream.toArray(Employee[]::new);
    }
}
