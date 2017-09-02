package jar;

import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/2/17.
 */
public class Jar {

    public static void main() {
        Jar.runProgram();
    }
    private static void runProgram() {
        double quarters;
        double dimes;
        double nickels;
        double pennies;
        String totalAmount = null;
        int totalDollarAmount = 0;
        int totalCentsAmount = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("We're going to count your cash in your piggy bank jar.");
        System.out.println("Enter in the # of quarters in the jar: ");
        quarters = scan.nextDouble();

        System.out.println("Enter in the # of dimes in the jar: ");
        dimes = scan.nextDouble();

        System.out.println("Enter the # of nickels in the jar: ");
        nickels = scan.nextDouble();

        System.out.println("Enter the # of pennies in the jar: ");
        pennies = scan.nextDouble();

        totalAmount = Jar.calculateJarTotal(quarters, nickels, dimes, pennies);

        System.out.println("Total amount is $" + totalAmount + ".");

        //extract dollar amount
        totalDollarAmount = Integer.parseInt(totalAmount.substring(0, totalAmount.indexOf('.')));

        //extract cents amount
        totalCentsAmount = Integer.parseInt(totalAmount.substring(totalAmount.indexOf('.') + 1));

        System.out.println("The jar contains precisely " + totalDollarAmount + " dollars and " + totalCentsAmount + " cents.");

    }
    public static String calculateJarTotal(double quarters, double nickels, double dimes, double pennies) {
        double totalAmount = 0.0;
        String total;

        totalAmount += Jar.calculateQuarterAmount(quarters);
        totalAmount += Jar.calcualateDimeAmount(dimes);
        totalAmount += Jar.calcualateNickelAmount(nickels);
        totalAmount += Jar.calcualatePenniesAmount(pennies);
        total = String.valueOf(totalAmount);

        return total;
    }

    public static double calculateQuarterAmount(double numberOfQuarters) {
        double quarterValue = 0.25 * numberOfQuarters;
        return quarterValue;
    }

    public static double calcualateDimeAmount(double numberOfDimes) {
        double dimeValue = 0.10 * numberOfDimes;
        return dimeValue;
    }

    public static double calcualateNickelAmount(double numberOfNickels) {
        double nickelValue = 0.05 * numberOfNickels;
        return nickelValue;
    }

    public static double calcualatePenniesAmount(double numberOfPennies) {
        double pennieValue = 0.01 * numberOfPennies;
        return pennieValue;
    }
}
