package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, Long> contactList = new HashMap<>();

    public void addContact(String name, Long phoneNumber) {
        contactList.put(name ,phoneNumber);
    }

    public Map<String, Long> getContactList() {
        return contactList;
    }

    public void printContactList() {
        for (Map.Entry<String, Long> contact: contactList.entrySet()) {
            System.out.println("Name: " +contact.getKey() + " and Phone Number:" + contact.getValue());
        }
    }

    public void removeContact(String name) {
        contactList.remove(name);
    }

    public void findNumber(String name){
        System.out.println("Number of " + name + " is " + contactList.get(name));
    }

}
