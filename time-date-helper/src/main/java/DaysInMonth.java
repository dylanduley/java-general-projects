import java.util.Scanner;

public class DaysInMonth {

    private final Scanner scanner;

    public DaysInMonth(Scanner scanner) {
        this.scanner = scanner;
    }

    public void getDaysInMonth() {
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        int daysInMonth = calculateDaysInMonth(month, year);
        System.out.println(daysInMonth > 0 ? "The month has " + daysInMonth + " days." : "INVALID VALUE");
    }

    private int calculateDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) return -1;
        return switch (month) {
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
