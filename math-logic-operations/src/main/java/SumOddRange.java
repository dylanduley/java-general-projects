import java.util.Scanner;

class SumOddRange {
    private Scanner scanner;

    public SumOddRange(Scanner scanner) {
        this.scanner = scanner;
    }

    public void sum() {
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();
        System.out.println("Sum of odd numbers: " + sumOdd(start, end));
    }

    private boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    private int sumOdd(int start, int end) {
        if (start > end || start < 0) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) sum += i;
        }
        return sum;
    }
}