package ch03.sec02;


public class IntSequenceTest {

    public static void main(String[] args) {

        IntSequence intSequence = IntSequence.digitsOf(1729);

        if (intSequence instanceof DigitSequence) {

            DigitSequence digitSequence = (DigitSequence) intSequence;

            System.out.println(digitSequence.rest());
        }
    }
}
