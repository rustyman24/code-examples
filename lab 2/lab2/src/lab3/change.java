package lab3;

import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double cost = s.nextDouble();
        double tendered = s.nextDouble();

        System.out.printf("Amount Due:\t\t£%.2f\nAmount Tendered:\t£%.2f\nChange Due:\t\t£%.2f",
                cost, tendered, tendered - cost);
    }
}
