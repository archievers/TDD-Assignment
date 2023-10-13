public class Maths {
    public int[] generateFibonacciSequence(int n) {
        int[] fibonacciSequence = new int[n];

        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        return fibonacciSequence;
    }
}
