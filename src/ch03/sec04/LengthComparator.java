package ch03.sec04;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    public static void main(String[] args) {

        Comparator<String> comparator;

//        1st method
        comparator = new LengthComparator();

//        2nd method
        comparator =
                (String first, String second) -> first.length() - second.length();

//        3rd method
        comparator =
                (String first, String second) -> {

                    int difference = first.length() - second.length();

                    if (difference < 0) {
                        return -1;
                    } else if (difference > 0) {
                        return 1;
                    } else {
                        return 0;
                    }
                };

//        4th method
        comparator =
                (first, second) -> first.length() - second.length();

//        5th method
        comparator =
                Comparator.comparingInt(String::length);

        System.out.println(comparator.compare("Hello", "World"));
    }
}
