package generic;

public class Main {

    public static void main(String[] args) {
        Coffee espresso = new Coffee("Dark");
        Cup<Coffee> cup = new Cup<>(espresso);
        cup.drink();

        Tea greenTea = new Tea("Green");
        Cup<Tea> tea = new Cup<>();
        tea.setLiquid(greenTea);
        tea.drink();
    }
}
