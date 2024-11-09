package collections.excercises;

public class Main {
    public static void main(String[] args) {
        Task3 task3 = new Task3();

        task3.populate();
        System.out.println(task3.convertListToSet());
        System.out.println(task3.repeatedNumbersWithCounter());
    }
}
