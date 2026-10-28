package lab3;

import java.util.Scanner;

public class convertmiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for miles travelled
        System.out.print("Enter the number of miles travelled: ");
        double miles = scanner.nextDouble();

        // Convert miles to kilometres (1 mile = 1.609 kilometres)
        double kilometres = miles * 1.609;

        // Output the result rounded to 2 decimal places
        System.out.printf("Distance in kilometres: %.2f km%n", kilometres);

        scanner.close();
    }
}
