package Akbar_MohammadAbeer_u2253319.Practical_17;
import java.util.Map;
import java.util.HashMap;

public class PhoneBook {
    private Map<String, PhoneBookEntry> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void insert(PhoneBookEntry entry) {
        phoneBook.put(entry.getFullName(), entry);
    }

    public void update(PhoneBookEntry entry) {
        phoneBook.put(entry.getFullName(), entry);
    }

    public void delete(String fullName) {
        phoneBook.remove(fullName);
    }

    public PhoneBookEntry get(String fullName) {
        return phoneBook.get(fullName);
    }

    public void printAll() {
        for (Map.Entry<String, PhoneBookEntry> entry : phoneBook.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
