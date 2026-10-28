public class displaytime {
    static void main(String[] args) {
        // Step 1: Declare and initialize total seconds
        int seconds = 5000;

        // Step 2: Calculate minutes using integer division (/)
        // 5000 / 60 gives 83 (it discards any leftover remainder)
        int minutes = seconds / 60;

        // Step 3: Calculate remaining seconds using the modulus operator (%)
        // 5000 % 60 gives 20 (the remainder after dividing by 60)
        int remainingSeconds = seconds % 60;

        // Step 4: Print the result in the requested format
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}
