import java.util.Scanner;

public class TimeConversion {

    private static final int MINUTES_IN_YEAR = 525_600;
    private static final int MINUTES_IN_DAY = 1_440;
    private final Scanner scanner;

    public TimeConversion(Scanner scanner) {
        this.scanner = scanner;
    }

    public void convertMinutes() {
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        displayYearsAndDays(minutes);
    }

    private void displayYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("INVALID VALUE");
            return;
        }
        long years = minutes / MINUTES_IN_YEAR;
        long remainingMinutes = minutes % MINUTES_IN_YEAR;
        long days = remainingMinutes / MINUTES_IN_DAY;
        System.out.printf("%d min = %d y and %d d%n", minutes, years, days);
    }

    public void formatDuration() {
        System.out.print("Enter the duration in seconds: ");
        int totalSeconds = scanner.nextInt();
        System.out.println(getFormattedDuration(totalSeconds));
    }

    private String getFormattedDuration(int totalSeconds) {
        if (totalSeconds < 0) return "INVALID VALUE";

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02dh %02dm %02ds", minutes / 60, minutes % 60, seconds);
    }
}
