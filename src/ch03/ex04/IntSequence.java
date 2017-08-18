package ch03.ex04;

public interface IntSequence {

    static void staticOf(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    void of(int... numbers);
}