package ch03.sec04;

import java.util.Comparator;

public class LengthComparator {

    public static void main(String[] args) {

        Comparator<String> comparator =
                (String first, String second) -> first.length() - second.length();

//        Comparator<String> comparator =
//                Comparator.comparingInt(String::length);

        System.out.println(comparator.compare("Hello", "World"));
    }
}
