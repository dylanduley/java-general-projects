import java.util.Scanner;

public class ViewAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a person
        System.out.println("Enter details for the person:");
        Person person = createPerson(scanner);

        // Create a bank account
        System.out.println("Enter details for the bank account for " + person.getFullName() + ":");
        BankAccount account = createAccount(scanner);

        // Display account details
        displayAccountDetails(account, person);

        // Performs account operations
        performAccountOperations(account, scanner);

        // Close the scanner
        scanner.close();
    }

    private static Person createPerson(Scanner scanner) {
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        return new Person(firstName, lastName, age);
    }

    private static BankAccount createAccount(Scanner scanner) {
        BankAccount account = new BankAccount();

        System.out.print("Account Number: ");
        int accountNumber = scanner.nextInt();
        account.setAccountNumber(accountNumber);
        scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();
        account.setEmail(email);

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        account.setPhoneNumber(phoneNumber);

        System.out.print("Initial Balance: ");
        double balance = scanner.nextDouble();
        account.setBalance(balance);
        return account;
    }

    private static void displayAccountDetails(BankAccount account, Person person) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + person.getFullName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println();
    }

    private static void performAccountOperations(BankAccount account, Scanner scanner) {
        System.out.print("Deposit Funds: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("New Balance after Deposit: " + account.getBalance());

        System.out.print("Withdraw Funds: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("New Balance after Withdrawal: " + account.getBalance());
    }
}
