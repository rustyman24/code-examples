package lab3;

import java.util.Scanner;

public class Circle2 {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read radius
        System.out.print("Enter the radius of the circle (in cm): ");
        double radius = scanner.nextDouble();

        // Calculations using Math functions
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        // Output results
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Circumference: " + circumference + " cm");
        System.out.println("Area: " + area + " cm²");

        scanner.close();

    }
}