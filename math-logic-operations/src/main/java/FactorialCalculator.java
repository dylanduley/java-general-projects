import java.util.Scanner;

class FactorialCalculator {
    private Scanner scanner;

    public FactorialCalculator(Scanner scanner) {
        this.scanner = scanner;
    }

    public void calculate() {
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Invalid input. Factorial is not defined for negative numbers.");
            return;
        }
        System.out.println("Factorial (iterative): " + factorialIterative(n));
        System.out.println("Factorial (recursive): " + factorialRecursive(n));
    }

    private int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private int factorialRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }
}