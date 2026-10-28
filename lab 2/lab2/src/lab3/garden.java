package lab3;

import java.util.Scanner;

public class garden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the length of the side of the garden (metres): ");
        double side = scanner.nextDouble();

        System.out.print("Enter the radius of the pond (metres): ");
        double radius = scanner.nextDouble();

        // Calculate the areas
        double squareArea = side * side;
        double circleArea = Math.PI * Math.pow(radius, 2);
        double grassArea = squareArea - circleArea;

        // Output the result rounded to 2 decimal places
        System.out.printf("The area of the grass is: %.2f square metres%n", grassArea);

        scanner.close();
    }
}
