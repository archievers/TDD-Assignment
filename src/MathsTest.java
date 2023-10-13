import org.junit.Test;
import org.junit.*;

public class MathsTest {

    @Test
    public void testFibonacciSequenceCompleteness() {
        Maths maths = new Maths();
        int[] actualSequence = maths.generateFibonacciSequence(10);

        int[] expectedSequence = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

        boolean sequenceComplete = true;
        for (int i = 0; i < 10; i++) {
            if (actualSequence[i] != expectedSequence[i]) {
                sequenceComplete = false;
                break;
            }
        }

        if (sequenceComplete) {
            System.out.println("Test Passed! The Fibonacci sequence is complete.");
            System.out.print("Fibonacci Sequence: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(actualSequence[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Test Failed. The Fibonacci sequence is not complete.");
        }

        for (int i = 0; i < 10; i++) {
            Assert.assertEquals(expectedSequence[i], actualSequence[i]);
        }
    }
}
