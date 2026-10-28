package lab3;

import javax.swing.*;

public class additontutor {
    public static void main(String[] args) {
        // Prompt the user for the first number using an input dialog
        String input1 = JOptionPane.showInputDialog("Enter the first integer:");
        int num1 = Integer.parseInt(input1);

        // Prompt the user for the second number using an input dialog
        String input2 = JOptionPane.showInputDialog("Enter the second integer:");
        int num2 = Integer.parseInt(input2);

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result in a message dialog box
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + sum);
    }
}