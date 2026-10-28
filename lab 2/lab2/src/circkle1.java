public class circkle1 {

    static void main(String[] args) {
        // Step 1: Set the radius of the circle
        double radius = 8.25;

        // Step 2: Calculate diameter (Diameter = 2 * radius)
        double diameter = 2 * radius;

        // Step 3: Calculate circumference (Circumference = 2 * PI * radius)
        double circumference = 2 * Math.PI * radius;

        // Step 4: Calculate area (Area = PI * radius squared)
        // Math.pow(radius, 2) means "radius raised to the power of 2"
        double area = Math.PI * Math.pow(radius, 2);

        // Step 5: Print out the answers
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);


    }
}
