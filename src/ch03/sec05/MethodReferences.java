package ch03.sec05;

import java.util.Arrays;
import java.util.Comparator;

public class MethodReferences {

    public static void main(String[] args) {

        String[] strings = {"Peter", "Paul", "Mary"};

//        1st method
//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

//        2nd method
//        Arrays.sort(strings, (x, y) -> x.compareToIgnoreCase(y));

//        3rd method
        Arrays.sort(strings, String::compareToIgnoreCase);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
