package ch03.ex06;

import java.util.Iterator;

public class Ex06 {

    public static void main(String[] args) {

        Iterator<Integer> iterator = new DigitSequence(1729);

        iterator.remove();

        iterator.forEachRemaining(integer -> System.out.println("Consume: " + integer));

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
