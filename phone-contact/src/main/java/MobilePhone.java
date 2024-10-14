import java.util.ArrayList;

public class MobilePhone {
    private final ArrayList<Contact> myContacts;

    public MobilePhone() {
        this.myContacts = new ArrayList<>();
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        if (oldContact == null || newContact == null) {
            System.out.println("Invalid contact provided.");
            return;
        }

        int index = findContactIndex(oldContact.name());
        if (index >= 0) {
            myContacts.set(index, newContact);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact does not exist.");
        }
    }

    public void removeContact(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid contact name provided.");
            return;
        }

        int index = findContactIndex(name);
        if (index >= 0) {
            myContacts.remove(index);
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact does not exist.");
        }
    }

    public void addContact(Contact contact) {
        if (contact == null) {
            System.out.println("Invalid contact provided.");
            return;
        }

        int index = findContactIndex(contact.name());
        if (index >= 0) {
            System.out.println("Contact already exists.");
        } else {
            myContacts.add(contact);
            System.out.println("Contact added successfully.");
        }
    }

    private int findContactIndex(String contactName) {
        if (contactName == null || contactName.trim().isEmpty()) {
            return -1;
        }
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.name().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public void showAllContacts() {
        if (myContacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        System.out.println("Contact List:");
        for (Contact myContact : this.myContacts) {
            System.out.println(myContact);
        }
    }
}
