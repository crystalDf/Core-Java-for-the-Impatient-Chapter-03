package ch03.ex04;


public class Ex04 {

    public static void main(String[] args) {

        IntSequence.staticOf(3, 1, 4, 1, 5, 9);

        IntSequence intSequence = new IntSequence() {
            @Override
            public void of(int... numbers) {
                for (int number : numbers) {
                    System.out.println(number);
                }
            }
        };

        System.out.println();

        intSequence.of(3, 1, 4, 1, 5, 9);
    }
}
