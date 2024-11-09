package collections.set;

import java.util.Scanner;

public class MainSet {
    public static void main(String[] args) {
        GuestList guestList = new GuestList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a guest");
        for (int i = 0; i < 10; i++) {
            guestList.addGuest(scanner.next());
        }

        guestList.allGuests();
    }
}
