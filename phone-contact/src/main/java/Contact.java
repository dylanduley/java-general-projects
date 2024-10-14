public record Contact(String name, String phoneNumber) {
    public Contact {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Contact name cannot be null or empty.");
        }
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty.");
        }
    }

    @Override
    public String toString() {
        return name + " - " + phoneNumber;
    }
}
