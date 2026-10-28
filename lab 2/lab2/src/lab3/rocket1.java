package lab3;

import java.util.Scanner;

public class rocket1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read take-off time (hours, minutes, seconds)
        System.out.print("Enter take-off hours (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Enter take-off minutes (0-59): ");
        int minutes = scanner.nextInt();

        System.out.print("Enter take-off seconds (0-59): ");
        int seconds = scanner.nextInt();

        // Read flight time in seconds
        System.out.print("Enter flight time in seconds: ");
        int flightTime = scanner.nextInt();

        // Calculate total seconds from midnight for take-off + flight time
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds + flightTime;

        // Calculate arrival time components (using % 24 to handle next-day wrap around)
        int arrHours = (totalSeconds / 3600) % 24;
        int arrMinutes = (totalSeconds % 3600) / 60;
        int arrSeconds = totalSeconds % 60;

        // Print output in the required format
        System.out.println();
        System.out.printf("Take-off Time:\t\t\t%02d:%02d:%02d\n", hours, minutes, seconds);
        System.out.printf("Flight Time:\t\t\t%d seconds\n", flightTime);
        System.out.printf("Expected Arrival Time:\t%02d:%02d:%02d\n", arrHours, arrMinutes, arrSeconds);

        scanner.close();
    }
}
