import java.util.Scanner;

public class DayOfWeek {

    private static final String[] DAYS_OF_WEEK = {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"
    };

    private final Scanner scanner;

    public DayOfWeek(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayDayInfo() {
        int today = getValidDay("What is today's date (1-7)? ");
        System.out.println("Today is: " + DAYS_OF_WEEK[today - 1]);

        int favoriteDay = getValidDay("What is your favorite day (1-7)? ");
        System.out.println("Your favorite day is: " + DAYS_OF_WEEK[favoriteDay - 1]);
    }

    private int getValidDay(String prompt) {
        System.out.print(prompt);
        return getValidInput(1, 7);
    }

    private int getValidInput(int min, int max) {
        while (true) {
            int value = scanner.nextInt();
            if (value >= min && value <= max) {
                return value;
            }
            System.out.printf("Invalid input. Please enter a number between %d and %d: ", min, max);
        }
    }
}
