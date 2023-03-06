import java.util.Scanner;
/**
* Calculate the length of the user's board foot.
*
* @author  Adrijan Vranjkovic
* @version 1.0
* @since   2023-02-26
*/

public final class BoardFoot {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private BoardFoot() {
        throw new IllegalStateException("Utility class.");
    }

    /**
    * This is method calculates the length of the board foot.
    *
    * @param height //
    * @param width //
    * @return double
    */
    public static double calculateLength(double height, double width) {
        // calculate the height.
        final double length = 144 / (height * width);
        // return call.
        return length;
    }

    /**
    * This is the main method.
    *
    * @param args //
    */
    public static void main(String[] args) {

        // Create scanner.
        final Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for the height.
            System.out.println("Enter the height in inches:");
            // Get the input and convert it to a double.
            final String userHeight = scanner.nextLine();
            final double heightAsDouble = Double.parseDouble(userHeight);
            // Ask user for the height.
            System.out.println("Enter the width in inches:");
            // Get the input and convert it to a double.
            final String userWidth = scanner.nextLine();
            final double widthAsDouble = Double.parseDouble(userWidth);

            // This if statement checks for positive input.
            if (widthAsDouble > 0 && heightAsDouble > 0) {

                // call the function to calculate the length.
                final double length =
                    calculateLength(widthAsDouble, heightAsDouble);

                // Display the length
                System.out.println("The length is "
                    + String.format("%.3f", length) + " inches.");
            } else {
                // Print when user enters invalid input.
                System.out.println("This is not a valid input.");
            }
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid value!"
                + error.getMessage());
        }
    }
}
