package calculator;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);

    private static int convertExpenseToInteger(String expenseInput, String typeOfExpense) {
        try {
            return Integer.parseInt(expenseInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("%s expenses must be a number: ".formatted(typeOfExpense));
        }
    }

    private static void validateExpense(int expense, String typeOfExpense) {
        if (expense < 0) {
            throw new IllegalArgumentException("%s expenses must be a positive number: ".formatted(typeOfExpense));
        }
    }

    public static int inputExpense(String typeOfExpense) {
        System.out.printf("%s expenses: ", typeOfExpense);
        while (true) {
            try {
                String input = scanner.nextLine();
                int staffExpenses = convertExpenseToInteger(input, typeOfExpense);
                validateExpense(staffExpenses, typeOfExpense);
                return staffExpenses;
            } catch (IllegalArgumentException e) {
                System.out.print(e.getMessage());
            }
        }
    }

    public static void close() {
        scanner.close();
    }
}
