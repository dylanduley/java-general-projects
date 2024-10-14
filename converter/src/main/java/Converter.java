import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1: Convert kilobytes to megabytes");
        System.out.println("2: Convert feet and inches to centimeters");
        System.out.println("3: Convert inches to centimeters");
        System.out.println("4: Convert kilometers per hour to miles per hour");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter kilobytes: ");
                int kiloBytes = scanner.nextInt();
                printMegaBytesAndKiloBytes(kiloBytes);
                break;
            case 2:
                System.out.print("Enter feet: ");
                int feet = scanner.nextInt();
                System.out.print("Enter inches: ");
                int inches = scanner.nextInt();
                int centimeters = calcFeetAndInchesToCentimeters(feet, inches);
                if (centimeters == -1) {
                    System.out.println("Invalid feet or inches value");
                } else {
                    System.out.println(feet + " feet " + inches + " inches = " + centimeters + " centimeters");
                }
                break;
            case 3:
                System.out.print("Enter inches: ");
                int totalInches = scanner.nextInt();
                int centimetersFromInches = calcFeetAndInchesToCentimeters(totalInches);
                if (centimetersFromInches == -1) {
                    System.out.println("Invalid inches value");
                } else {
                    System.out.println(totalInches + " inches = " + centimetersFromInches + " centimeters");
                }
                break;
            case 4:
                System.out.print("Enter kilometers per hour: ");
                double kilometersPerHour = scanner.nextDouble();
                printConversion(kilometersPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
        }
    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet >= 0 && inches >= 0 && inches < 12) {
            return (int) ((inches * 2.54) + (feet * 30.48));
        } else {
            return -1;
        }
    }

    public static int calcFeetAndInchesToCentimeters(int inches) {
        if (inches >= 0) {
            int feet = inches / 12;
            inches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        } else {
            return -1;
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
