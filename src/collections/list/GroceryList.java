package collections.list;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {



    List<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
        System.out.println("Added: " + item);
    }

    public void checkIfExists(String item) {
        for (String grocery : groceryList) {
            if (grocery.equals(item)) {
                System.out.println("Found: " + item);
            }
        }
    }

    public void printList(){
        for (String grocery : groceryList) {
            System.out.println(grocery);
        }
    }
}
