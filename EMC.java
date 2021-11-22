/*
* The "EMC" program calculates the energy an object could
* release using E=mc^2
*
* @author  Myles Trump
* @version 1.0
* @since   2021-11-22
*/

import java.util.Scanner;

/**
* This is a program that calculate E=mc^2.
*/
final class EMC {

    /**
    * Speed of Light.
    */
    public static final double SPEED_OF_LIGHT = 299792458;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private EMC() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        final double energyReleased;

        final Scanner userInput = new Scanner(System.in);

        // Block of code to try
        try {
                // ask the user to input the mass of their object
                System.out.print("Enter the mass of your object (kg): ");

                // Stores float in mass
                final float mass = userInput.nextFloat();

                // calculate how much energy is released
                energyReleased = SPEED_OF_LIGHT * mass;

                // Outputs how much energy is released
                System.out.println("\nYou will release "
                        + energyReleased + " joules.");
        }
        // Block of code to handle errors
        catch (Exception e) {

                System.out.println("\nYou have not entered a valid input.");
        }

        System.out.println("\nDone.");
    }
}

