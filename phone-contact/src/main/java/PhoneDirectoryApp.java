import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneDirectoryApp {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        MobilePhone phone = new MobilePhone();

        while (!quit) {
            showOptions();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    showOptions();
                    break;
                case 2:
                    addNewContact(phone);
                    break;
                case 3:
                    removeNewContact(phone);
                    break;
                case 4:
                    updateNewContact(phone);
                    break;
                case 5:
                    phone.showAllContacts();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Incorrect Choice. Please Try Again.");
            }
        }
    }

    private static void showOptions() {
        System.out.println("Type which option you would like to do on your phone! :)");
        System.out.println("1: Show Options");
        System.out.println("2: Add Contact");
        System.out.println("3: Remove Contact");
        System.out.println("4: Update Contact");
        System.out.println("5: View All Contact(s)");
        System.out.println("6: Quit");
    }

    private static int getUserChoice() {
        while (true) {
            try {
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine();
                return choice;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }
        }
    }

    private static void removeNewContact(MobilePhone phone) {
        System.out.print("Enter the name of the contact: ");
        String name = input.nextLine();
        phone.removeContact(name);
    }

    private static void addNewContact(MobilePhone phone) {
        System.out.print("Enter name of contact: ");
        String contactName = input.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();
        Contact contact = new Contact(contactName, phoneNumber);
        phone.addContact(contact);
    }

    private static void updateNewContact(MobilePhone phone) {
        System.out.print("Enter the name of the old contact: ");
        String oldContactName = input.nextLine();
        System.out.print("Enter their old phone number: ");
        String oldPhoneNumber = input.nextLine();
        System.out.print("Enter new name of contact: ");
        String newContactName = input.nextLine();
        System.out.print("Enter new phone number: ");
        String newPhoneNumber = input.nextLine();
        Contact oldContact = new Contact(oldContactName, oldPhoneNumber);
        Contact newContact = new Contact(newContactName, newPhoneNumber);
        phone.updateContact(oldContact, newContact);
    }
}
