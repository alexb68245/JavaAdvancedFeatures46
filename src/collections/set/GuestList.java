package collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GuestList {

    Set<String> guestList = new HashSet<>();

    public void addGuest(String guest) {


        if (guestList.contains(guest)){
            System.out.println(guest + " is already in the guest list");
        }else {
            guestList.add(guest);
            System.out.println(guest + " added to the guest list");
        }
    }

    public void allGuests(){
        for (String guest : guestList) {
            System.out.println(guest);
        }
    }
}
