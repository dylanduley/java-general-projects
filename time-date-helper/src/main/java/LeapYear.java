import java.util.Scanner;

public class LeapYear {

    private final Scanner scanner;

    public LeapYear(Scanner scanner) {
        this.scanner = scanner;
    }

    public void checkLeapYear() {
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (isLeap ? " is a leap year." : " is not a leap year."));
    }
}
