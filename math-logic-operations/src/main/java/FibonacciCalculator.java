import java.util.Scanner;

class FibonacciCalculator {
    private Scanner scanner;

    public FibonacciCalculator(Scanner scanner) {
        this.scanner = scanner;
    }

    public void calculate() {
        System.out.print("Enter the position: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Invalid input. Fibonacci is not defined for negative numbers.");
            return;
        }
        System.out.println("Fibonacci (iterative): " + fibonacciIterative(n));
        System.out.println("Fibonacci (recursive): " + fibonacciRecursive(n));
    }

    private int fibonacciIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int x = 0, y = 1;
        for (int i = 2; i <= n; i++) {
            int temp = y;
            y = x + y;
            x = temp;
        }
        return y;
    }

    private int fibonacciRecursive(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}