import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class rectangle2JOptionPane {
    static void main(String[] args) {
        // Step 1: Set up DecimalFormat for 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");

        // Step 2: Get length input from the user using JOptionPane
        String lengthInput = JOptionPane.showInputDialog(null, "Enter the rectangle length:");
        double length = Double.parseDouble(lengthInput);

        // Step 3: Get breadth input from the user using JOptionPane
        String breadthInput = JOptionPane.showInputDialog(null, "Enter the rectangle breadth:");
        double breadth = Double.parseDouble(breadthInput);

        // Step 4: Calculate area and perimeter
        double area = length * breadth;
        double perimeter = (length + breadth) * 2.0;

        // Step 5: Build a formatted result message
        String result = "Rectangle Details:\n"
                + "-------------------\n"
                + "Length: " + df.format(length) + "\n"
                + "Breadth: " + df.format(breadth) + "\n"
                + "Area: " + df.format(area) + "\n"
                + "Perimeter: " + df.format(perimeter);

        // Step 6: Display the output in a message dialog box
        JOptionPane.showMessageDialog(null, result);

    }
}
