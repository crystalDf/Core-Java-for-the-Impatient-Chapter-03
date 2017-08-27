package ch03.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex07 {

    public static void main(String[] args) {

        luckySort(new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E")), Comparator.naturalOrder());
    }

    private static void luckySort(ArrayList<String> strings, Comparator<String> comparator) {

        boolean sorted = false;

        while (!sorted) {

            System.out.println(strings);

            Collections.shuffle(strings);

            sorted = isSorted(strings, comparator);
        }

        System.out.println(strings);
    }

    private static boolean isSorted(ArrayList<String> strings, Comparator<String> comparator) {

        for (int i = 1; i < strings.size(); i++) {

            if (comparator.compare(strings.get(i - 1), strings.get(i)) > 0){
                return false;
            }
        }

        return true;
    }
}
