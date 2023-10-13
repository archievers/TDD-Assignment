public class Main {
    public static void main(String[] args) {
        Maths maths = new Maths();

        int[] fibonacciSequence = maths.generateFibonacciSequence(10);

        System.out.println("Generated Fibonacci sequence:");
        for (int num : fibonacciSequence) {
            System.out.print(num + " ");
        }
    }
}
