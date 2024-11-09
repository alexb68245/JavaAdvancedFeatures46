package collections.queue;

import java.util.Scanner;

public class MainQueue {

    public static void main(String[] args) {
        Store store = new Store();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter person: ");

        for(int i = 0; i <= 5; i++){
            store.enterStore(scanner.next());
        }

        System.out.println("Store before first exit");
        store.printStore();
        store.exitStore();
        System.out.println("Store after first exit");
        store.printStore();
    }
}
