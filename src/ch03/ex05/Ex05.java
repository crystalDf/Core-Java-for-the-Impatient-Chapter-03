package ch03.ex05;

public class Ex05 {

    public static void main(String[] args) {

        IntSequence intSequence = IntSequence.constant(1);

        while (intSequence.hasNext()) {
            System.out.println(intSequence.next());
        }
    }
}
