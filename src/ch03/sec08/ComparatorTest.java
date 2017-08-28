package ch03.sec08;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

    public static void main(String[] args) {

        Person[] people = new Person[4];

        people[0] = new Person("Hermione","Jane","Granger");
        people[1] = new Person("Harry", "James", "Potter");
        people[2] = new Person("Ron", "Billius", "Weasley");
        people[3] = new Person("Ginny", null, "Weasley");

        Arrays.sort(people, Comparator.comparing(Person::getName));

        System.out.println(Arrays.toString(people));

        Arrays.sort(people, Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getFirstName));

        System.out.println(Arrays.toString(people));

        Arrays.sort(people, Comparator.comparing(Person::getName,
                (s, t) -> s.length() - t.length()));

        System.out.println(Arrays.toString(people));

        Arrays.sort(people, Comparator.comparing(Person::getName,
                Comparator.comparingInt(String::length)));

        System.out.println(Arrays.toString(people));

        Arrays.sort(people, Comparator.comparing(p -> p.getName().length()));

        System.out.println(Arrays.toString(people));

        Arrays.sort(people, Comparator.comparing(Person::getMiddleName,
                Comparator.nullsFirst(Comparator.naturalOrder())));

        System.out.println(Arrays.toString(people));

        Arrays.sort(people, Comparator.comparing(Person::getMiddleName,
                Comparator.nullsFirst(Comparator.reverseOrder())));

        System.out.println(Arrays.toString(people));

        Arrays.sort(people, Comparator.comparing(Person::getMiddleName,
                Comparator.nullsLast(Comparator.naturalOrder())));

        System.out.println(Arrays.toString(people));

        Arrays.sort(people, Comparator.comparing(Person::getMiddleName,
                Comparator.nullsLast(Comparator.reverseOrder())));

        System.out.println(Arrays.toString(people));
    }
}
