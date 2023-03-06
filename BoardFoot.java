// A Java program to demonstrate random number generation
// using java.util.Random;
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

            System.out.println("Enter the height in inches:");

            final String userHeight = scanner.nextLine();
            final double heightAsDouble = Double.parseDouble(userHeight);

            System.out.println("Enter the width in inches:");
            final String userWidth = scanner.nextLine();
            final double widthAsDouble = Double.parseDouble(userWidth);

            // call the function to calculate the length.
            final double length =
                calculateLength(widthAsDouble, heightAsDouble);

            // Display the length
            System.out.println("The length is " + length + " inches.");
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid value!"
                + error.getMessage());
        }
    }
}
