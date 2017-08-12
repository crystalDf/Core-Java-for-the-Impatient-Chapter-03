package ch03.sec04;

import java.util.Comparator;

public class LengthComparator {

    public static void main(String[] args) {

//        1st method
//        Comparator<String> comparator =
//                (String first, String second) -> first.length() - second.length();

        Comparator<String> comparator =
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

//        Comparator<String> comparator =
//                Comparator.comparingInt(String::length);

        System.out.println(comparator.compare("Hello", "World"));
    }
}
