package ch03.sec01;

public class IntSequenceTest {

    public static void main(String[] args) {

        SquareSequence squareSequence = new SquareSequence();

        double average = getAverage(squareSequence, 100);

        System.out.println(average);

        IntSequence intSequence = new DigitSequence(1729);

        average = getAverage(intSequence, 100);

        System.out.println(average);

        if (intSequence instanceof DigitSequence) {

            DigitSequence digitSequence = (DigitSequence) intSequence;

            System.out.println(digitSequence.rest());
        }
    }

    public static double getAverage(IntSequence intSequence, int n) {

        int count = 0;
        double sum = 0;

        while (intSequence.hasNext() && count < n) {
            count++;
            sum += intSequence.next();
        }

        return (count == 0) ? 0 : (sum / count);
    }
}
