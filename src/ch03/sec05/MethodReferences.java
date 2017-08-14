package ch03.sec05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferences {

    public static void main(String[] args) {

        String[] strings = {"Peter", "Paul", "Mary"};

//        1st method
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

//        2nd method
//      You can supply a lambda expression whenever
//      an object of an interface with a single abstract method is expected.
//      Such an interface is called a functional interface.
        Arrays.sort(strings, (x, y) -> x.compareToIgnoreCase(y));

//        3rd method
//      Class::instanceMethod
//      The first parameter becomes the receiver of the method,
//      and any other parameters are passed to the method.
        Arrays.sort(strings, String::compareToIgnoreCase);

        for (String string : strings) {
            System.out.println(string);
        }

        List<String> list = Arrays.asList(strings);

//        1st method
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return Objects.isNull(s);
            }
        });

//        2nd method
        list.removeIf(x -> Objects.isNull(x));

//        3rd method
//      Class::staticMethod
//      All parameters are passed to the static method.
        list.removeIf(Objects::isNull);

//        1st method
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

//        2nd method
        list.forEach(x -> System.out.println(x));

//        3rd method
//      object::instanceMethod
//      The method is invoked on the given object,
//      and the parameters are passed to the instance method.
        list.forEach(System.out::println);
    }
}
