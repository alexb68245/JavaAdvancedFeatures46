package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Store {

    Queue<String> storeLine = new LinkedList<>();

    public void enterStore(String person) {
        storeLine.offer(person);
    }

    public void exitStore() {
        storeLine.poll();
    }

    public void printStore() {
        System.out.println(storeLine);
    }
}
