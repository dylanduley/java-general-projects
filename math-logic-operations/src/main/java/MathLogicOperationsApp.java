import java.util.Scanner;

public class MathLogicOperationsApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MathLogicOperationsApp app = new MathLogicOperationsApp();
        app.start();
    }

    public void start() {
        while (true) {
            showMenu();
            int choice = getUserChoice();
            if (choice == 0) break;
            executeOperation(choice);
        }
        scanner.close();
    }

    private void showMenu() {
        System.out.println("\nChoose an operation:");
        System.out.println("1. Compare Decimals");
        System.out.println("2. Print Equality Status");
        System.out.println("3. Calculate Factorial");
        System.out.println("4. Calculate Fibonacci");
        System.out.println("5. Sum of N Numbers");
        System.out.println("6. FizzBuzz");
        System.out.println("7. Check Valid Subsequence");
        System.out.println("8. Sum Multiples of 3 and 5");
        System.out.println("9. Sum Odd Range");
        System.out.println("10. Times Table");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    private int getUserChoice() {
        return scanner.nextInt();
    }

    private void executeOperation(int choice) {
        switch (choice) {
            case 1 -> new DecimalComparator(scanner).compare();
            case 2 -> new EqualityChecker(scanner).check();
            case 3 -> new FactorialCalculator(scanner).calculate();
            case 4 -> new FibonacciCalculator(scanner).calculate();
            case 5 -> new SumOfNCalculator(scanner).calculate();
            case 6 -> new FizzBuzzGenerator().generate();
            case 7 -> new SubsequenceChecker(scanner).check();
            case 8 -> new SumMultiplesOf3And5().calculate();
            case 9 -> new SumOddRange(scanner).sum();
            case 10 -> new TimesTableGenerator(scanner).generate();
            default -> System.out.println("Invalid choice.");
        }
    }
}
