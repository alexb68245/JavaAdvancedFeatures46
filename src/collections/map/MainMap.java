package collections.map;

import java.util.Scanner;

public class MainMap {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add 5 contacts");

        for (int i = 0; i <5; i++) {
            phoneBook.addContact(scanner.next(), scanner.nextLong());
        }

        System.out.println(phoneBook.getContactList());
        phoneBook.printContactList();

        phoneBook.removeContact("Bob");
        System.out.println(phoneBook.getContactList());
        phoneBook.findNumber("Aleksia");
    }
}
