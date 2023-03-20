package Portfolio.Practical_17;

public class User {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        PhoneBookEntry entry1 = new PhoneBookEntry("John Smith", "123-456-7890", "john@example.com", "123 Main St");
        PhoneBookEntry entry2 = new PhoneBookEntry("Jane Smith", "098-765-4321", "jane@example.com", "456 Market St");
        PhoneBookEntry entry3 = new PhoneBookEntry("Bob Johnson", "111-111-1111", "bob@example.com", "789 Market St");

        phoneBook.insert(entry1);
        phoneBook.insert(entry2);
        phoneBook.insert(entry3);

        phoneBook.printAll();
        // Output:
        // Full Name: John Smith, Phone Number: 123-456-7890, Email: john@example.com, Address: 123 Main St
        // Full Name: Jane Smith, Phone Number: 098-765-4321, Email: jane@example.com, Address: 456 Market St
        // Full Name: Bob Johnson, Phone Number: 111-111-1111, Email: bob@example.com, Address: 789 Market St

        PhoneBookEntry entry4 = new PhoneBookEntry("Jane Smith", "111-111-1111", "jane@example.com", "456 Market St");
        phoneBook.update(entry4);

        phoneBook.printAll();
        // Output:
        // Full Name: John Smith, Phone Number: 123-456-7890, Email: john@example.com, Address: 123 Main St
        // Full Name: Jane Smith, Phone Number: 111-111-1111, Email: jane@example.com, Address: 456 Market St
        // Full Name: Bob Johnson, Phone Number: 111-111-1111, Email: bob@example.com, Address: 789 Market St

        phoneBook.delete("Bob Johnson");

        phoneBook.printAll();
        // Output:
        // Full Name: John Smith, Phone Number: 123-456-7890, Email: john@example.com, Address: 123 Main St
        // Full Name: Jane Smith, Phone Number: 111-111-1111, Email: jane@example.com, Address: 456 Market St

        PhoneBookEntry entry = phoneBook.get("John Smith");
        System.out.println(entry);
        // Output: Full Name: John Smith, Phone Number: 123-456-7890, Email: john@example.com, Address: 123 Main St
    }
}

