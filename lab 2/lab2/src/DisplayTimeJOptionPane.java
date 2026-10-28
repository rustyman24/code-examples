import javax.swing.*;

public class DisplayTimeJOptionPane {

    static void main(String[] args) {
        // Step 1: Ask the user to enter the number of seconds
        String input = JOptionPane.showInputDialog(null, "Enter total seconds:");

        // Step 2: Convert the input text (String) into a whole number (int)
        int seconds = Integer.parseInt(input);

        // Step 3: Calculate minutes and remaining seconds
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        // Step 4: Create the output message string
        String message = seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds";

        // Step 5: Display the result in a message dialog box
        JOptionPane.showMessageDialog(null, message);

    }
}
