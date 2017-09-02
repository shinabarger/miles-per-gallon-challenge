package gas_mileage;

import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/1/17.
 */
public class GasMileage {

    public static void main() {

        GasMileage.instructions();

    }

    private static void instructions() {
        double milesTotal = 0.0;
        double gallonsTotal = 0.0;
        double milesPerGallon = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.println("This is a miles per gallon calculator. Please enter how many miles you went or will go.");
        milesTotal = Double.parseDouble(scan.nextLine());

        System.out.println("How many gallons have you used or will you use?");
        gallonsTotal = Double.parseDouble(scan.nextLine());

        milesPerGallon = returnMilesPerGallon(milesTotal, gallonsTotal);
        System.out.println("Your miles per gallon is " + milesPerGallon);
    }

    public static double returnMilesPerGallon(double miles, double gallonsOfGas) {

        double milesPerGallon = (miles / gallonsOfGas);
        return milesPerGallon;
    }

}
