import java.util.Scanner;

public class RoomInitializer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Chair chair = createChair(scanner);
        Bed bed = createBed(scanner);
        Desk desk = createDesk(scanner);
        Lamp lamp = createLamp(scanner);

        Bedroom kidsRoom = new Bedroom(bed, chair, desk, lamp);

        System.out.println("Turning the lamp on...");
        kidsRoom.turnOnOrOffLamp();

        kidsRoom.displayDetails();

        System.out.println("Turning lamp off...");
        kidsRoom.turnOnOrOffLamp();

        scanner.close();
    }

    private static Chair createChair(Scanner scanner) {
        int legs = getValidIntInput(scanner, "Enter the number of chair legs: ");
        Material chairMaterial = getValidEnumInput(scanner, "Enter the material of the chair (WOOD, METAL, PLASTIC): ", Material.class);
        return new Chair(legs, chairMaterial);
    }

    private static Bed createBed(Scanner scanner) {
        BedSize bedSize = getValidEnumInput(scanner, "Enter bed size (TWIN, FULL, QUEEN, KING): ", BedSize.class);
        int numOfPillows = getValidIntInput(scanner, "Enter number of pillows: ");
        return new Bed(bedSize, numOfPillows);
    }

    private static Desk createDesk(Scanner scanner) {
        DeskSize deskSize = getValidEnumInput(scanner, "Enter desk size (SMALL, MEDIUM, LARGE): ", DeskSize.class);
        Material deskMaterial = getValidEnumInput(scanner, "Enter the material of the desk (WOOD, METAL, PLASTIC): ", Material.class);
        return new Desk(deskSize, deskMaterial);
    }

    private static Lamp createLamp(Scanner scanner) {
        BulbType bulbType = getValidEnumInput(scanner, "Enter bulb type (INCANDESCENT, LED, CFL): ", BulbType.class);
        int lampWattage = getValidIntInput(scanner, "Enter lamp wattage: ");
        return new Lamp(bulbType, lampWattage, false);
    }

    private static int getValidIntInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private static <E extends Enum<E>> E getValidEnumInput(Scanner scanner, String prompt, Class<E> enumClass) {
        while (true) {
            System.out.print(prompt);
            try {
                return Enum.valueOf(enumClass, scanner.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter a valid value from the list.");
            }
        }
    }
}
