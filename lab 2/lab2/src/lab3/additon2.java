package lab3;

import javax.swing.*;

public class additon2 {
    public static void main(String[] args) {
        // Generate two random numbers between 1 and 20
        int num1 = (int) (Math.random() * 20) + 1;
        int num2 = (int) (Math.random() * 20) + 1;

        // Calculate the correct sum
        int correctSum = num1 + num2;

        // Prompt the user for their answer using an input dialog
        String input = JOptionPane.showInputDialog("What is " + num1 + " + " + num2 + "?");
        int userAnswer = Integer.parseInt(input);

        // Check if the user is correct and display the appropriate message
        if (userAnswer == correctSum) {
            JOptionPane.showMessageDialog(null, "Correct! Well done.");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer was " + correctSum + ".");
        }
    }
}