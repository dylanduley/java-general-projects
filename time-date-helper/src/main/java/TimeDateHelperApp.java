import java.util.Scanner;

public class TimeDateHelperApp {

    private final TimeDateOptions options;
    private final Scanner scanner;

    public TimeDateHelperApp() {
        this.scanner = new Scanner(System.in);
        this.options = new TimeDateOptions(scanner);
    }

    public static void main(String[] args) {
        new TimeDateHelperApp().start();
    }

    public void start() {
        boolean isRunning = true;
        while (isRunning) {
            int choice = options.display();
            isRunning = handleChoice(choice);
        }
    }

    private boolean handleChoice(int choice) {
        switch (choice) {
            case 1 -> new DayOfWeek(scanner).displayDayInfo();
            case 2 -> new TimeConversion(scanner).convertMinutes();
            case 3 -> new DaysInMonth(scanner).getDaysInMonth();
            case 4 -> new TimeConversion(scanner).formatDuration();
            case 5 -> new LeapYear(scanner).checkLeapYear();
            case 6 -> {
                System.out.println("Exiting the program. Goodbye!");
                return false;
            }
            default -> System.out.println("Invalid choice. Please try again.");
        }
        return true;
    }
}
