import java.util.Scanner;

class DecimalComparator {
    private Scanner scanner;

    public DecimalComparator(Scanner scanner) {
        this.scanner = scanner;
    }

    public void compare() {
        System.out.print("Enter first decimal: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second decimal: ");
        double num2 = scanner.nextDouble();
        boolean result = (int) (num1 * 1000) == (int) (num2 * 1000);
        System.out.println("Are equal by three decimal places: " + result);
    }
}