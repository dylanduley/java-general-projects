import java.util.Scanner;

class TimesTableGenerator {
    private Scanner scanner;

    public TimesTableGenerator(Scanner scanner) {
        this.scanner = scanner;
    }

    public void generate() {
        System.out.print("Enter a number for the times table: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
    }
}