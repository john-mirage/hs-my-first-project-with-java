package calculator;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);

    private static int askForPositiveNumber(String subject) {
        while (true) {
            try {
                int staffExpenses = Integer.parseInt(scanner.nextLine());
                if (staffExpenses >= 0) {
                    return staffExpenses;
                } else {
                    System.out.printf("%s must be a positive number\n", subject);
                }
            } catch (NumberFormatException e) {
                System.out.printf("%s must be a number\n", subject);
            }
        }
    }

    public static int askForStaffExpenses() {
        System.out.println("Staff expenses:");
        return askForPositiveNumber("Staff expenses");
    }

    public static int askForOtherExpenses() {
        System.out.println("Other expenses:");
        return askForPositiveNumber("Other expenses");
    }

    public static void close() {
        scanner.close();
    }
}
