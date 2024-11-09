package collections.list;

import java.util.Scanner;

public class MainList {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add 5 items you need: ");

        for (int i = 0; i < 5; i++) {
            groceryList.addItem(scanner.next());
        }
        System.out.println("Enter the item you want to check: ");
        groceryList.checkIfExists(scanner.next());

        groceryList.printList();
    }
}
