package ch03.ex05;

public interface IntSequence {

    static void constant(int n) {
        while (true) {
            System.out.println(n);
        }
    }
}