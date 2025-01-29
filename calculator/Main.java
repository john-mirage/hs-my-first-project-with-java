package calculator;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("Bubblegum", 202);
        products.put("Toffee", 118);
        products.put("Ice cream", 2250);
        products.put("Milk chocolate", 1680);
        products.put("Doughnut", 1075);
        products.put("Pancake", 80);
        int income = 0;
        System.out.println("Earned amount:");
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.printf("%s: $%d\n", entry.getKey(), entry.getValue());
            income += entry.getValue();
        }
        System.out.printf("\nIncome: $%d\n", income);
        int staffExpenses = UserInterface.askForStaffExpenses();
        int otherExpenses = UserInterface.askForOtherExpenses();
        System.out.printf("Net income: $%d\n", income - (staffExpenses + otherExpenses));
        UserInterface.close();
    }
}
