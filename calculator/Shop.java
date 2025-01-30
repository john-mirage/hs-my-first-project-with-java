package calculator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    private final Map<String, Integer> productSales;
    private int income;

    public Shop() {
        this.productSales = new HashMap<>();
        this.income = 0;
        this.initializeProductSales();
        this.initializeIncome();
    }

    public int getIncome() {
        return this.income;
    }

    private void initializeProductSales() {
        this.productSales.put("Bubblegum", 202);
        this.productSales.put("Toffee", 118);
        this.productSales.put("Ice cream", 2250);
        this.productSales.put("Milk chocolate", 1680);
        this.productSales.put("Doughnut", 1075);
        this.productSales.put("Pancake", 80);
    }

    private void initializeIncome() {
        for (int value : this.productSales.values()) {
            this.income += value;
        }
    }

    public void addExpenses(int... expenses) {
        if (expenses.length != 0) {
            if (Arrays.stream(expenses).allMatch(expense -> expense >= 0)) {
                this.income -= Arrays.stream(expenses).sum();
            } else {
                throw new IllegalArgumentException("All expenses must be positive numbers");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder productSales = new StringBuilder().append("Earned amount:\n");
        for (Map.Entry<String, Integer> entry : this.productSales.entrySet()) {
            String productSale = "%s: $%d\n".formatted(entry.getKey(), entry.getValue());
            productSales.append(productSale);
        }
        return productSales.toString();
    }
}
