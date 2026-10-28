public class Converttemprature {
    static void main(String[] args) {
        // Step 1: Declare and set the temperature in Centigrade
        double centigrade = -25.65;

        // Step 2: Convert Centigrade to Fahrenheit

        double fahrenheit = (9.0 / 5.0) * centigrade + 32;

        // Step 3: Print the results
        System.out.println("Centigrade: " + centigrade + "°C");
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
    }
}
