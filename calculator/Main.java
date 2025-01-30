package calculator;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println(shop);
        System.out.printf("Income: $%d\n", shop.getIncome());
        shop.addExpenses(
                UserInterface.inputExpense("Staff"),
                UserInterface.inputExpense("Other")
        );
        System.out.printf("Net income: $%d\n", shop.getIncome());
        UserInterface.close();
    }
}
