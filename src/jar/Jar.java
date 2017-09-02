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
        double totalAmount;

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



    }
}
