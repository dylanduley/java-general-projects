import java.util.Scanner;

public class TimeDateOptions {

    private final Scanner scanner;

    public TimeDateOptions(Scanner scanner) {
        this.scanner = scanner;
    }

    public int display() {
        System.out.println("\nSelect an option:");
        System.out.println("1 - Print a day of the week");
        System.out.println("2 - Convert minutes to years and days");
        System.out.println("3 - Get days in a month");
        System.out.println("4 - Format duration in hours, minutes and seconds)");
        System.out.println("5 - Check if a year is a leap year");
        System.out.println("6 - Exit");
        System.out.print("Enter your choice: ");
        // Gather the valid input option
        return getValidInput();
    }

    private int getValidInput() {
        while (true) {
            try {
                int input = scanner.nextInt();
                scanner.nextLine();
                return input;
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a valid integer: ");
                scanner.nextLine();
            }
        }
    }
}
