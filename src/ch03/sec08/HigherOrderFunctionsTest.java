package ch03.sec08;

import java.util.Arrays;
import java.util.Comparator;

public class HigherOrderFunctionsTest {

    public static void main(String[] args) {

        String[] friends = {"Peter", "Paul", "Mary", "oliver"};

        Arrays.sort(friends, compareInDirection(1));

        System.out.println(Arrays.toString(friends));

        Arrays.sort(friends, compareInDirection(-1));

        System.out.println(Arrays.toString(friends));

        Arrays.sort(friends, reverse(String::compareTo));

        System.out.println(Arrays.toString(friends));

        Arrays.sort(friends, reverse(String::compareToIgnoreCase));

        System.out.println(Arrays.toString(friends));

    }

    public static Comparator<String> compareInDirection(int direction) {

        return (x, y) -> direction * x.compareTo(y);
    }

    public static Comparator<String> reverse(Comparator<String> comparator) {

        return (x, y) -> comparator.compare(y, x);
    }
}
