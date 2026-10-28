package lab3;

import java.util.Scanner;

public class investment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the investment amount
        System.out.print("Enter investment amount: ");
        double principal = scanner.nextDouble();

        // Prompt user for the number of years
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // Calculate 5% simple interest
        // Formula: Total = Principal + (Principal * Rate * Years)
        double interestRate = 3.5;
        double totalValue = principal + (principal * interestRate * years);

        // Output the final investment value
        System.out.println("The value of the investment after " + years + " years is: " + totalValue);

        scanner.close();
    }
}
