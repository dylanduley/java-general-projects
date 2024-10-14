import java.util.Scanner;

class SumOfNCalculator {
    private Scanner scanner;

    public SumOfNCalculator(Scanner scanner) {
        this.scanner = scanner;
    }

    public void calculate() {
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Invalid input.");
            return;
        }
        System.out.println("Sum of numbers from 1 to " + n + " = " + nSum(n));
    }

    private int nSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}