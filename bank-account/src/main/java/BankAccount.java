public class BankAccount {
    private double balance;
    private int accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Constructor to initialize the bank account
    public BankAccount() {
        this.accountNumber = 0;
        this.customerName = "";
        this.email = "";
        this.phoneNumber = "";
        this.balance = 0;
    }

    // Helper method to validate non-empty strings
    private String validateNonEmpty(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty.");
        }
        return value;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Account number must be positive.");
        }
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = validateNonEmpty(customerName, "Customer name");
    }

    public void setEmail(String email) {
        this.email = validateNonEmpty(email, "Email");
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = validateNonEmpty(phoneNumber, "Phone number");
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Deposit funds
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Withdraw funds
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.printf("""
                Account Number: %d
                Customer Name: %s
                Email: %s
                Phone Number: %s
                Balance: %.2f
                """, accountNumber, customerName, email, phoneNumber, balance);
    }
}
