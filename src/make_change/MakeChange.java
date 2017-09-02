package make_change;

import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/2/17.
 */
public class MakeChange {

    public static void main() {

        MakeChange.runTheInstructions();
    }

    private static void runTheInstructions() {
        int dollarsToReturn = 0;
        int quartersToReturn = 0;
        int dimesToReturn = 0;
        int nickelsToReturn = 0;
        int penniesToReturn = 0;
        double priceOfTheItem;
        double totalPaymentReceived;
        double totalChangeToGive;
        double changeLeftToGive;

        Scanner scan = new Scanner(System.in);

        System.out.println("Hi there. Welcome to POS Changemaker 9000.");

        System.out.println("Please enter the item cost: ");
        priceOfTheItem = scan.nextDouble();

        System.out.println("Enter amount received by customer: ");
        totalPaymentReceived = scan.nextDouble();

        totalChangeToGive = subtractItemAmountFromCashReceived(priceOfTheItem, totalPaymentReceived);
        System.out.println("Total change to give back to customer is " + totalChangeToGive + ".");

        dollarsToReturn = calculateTotalDollarsToReturn(totalChangeToGive);
        totalChangeToGive = -dollarsToReturn;

        quartersToReturn = calculateQuartersToReturn(totalChangeToGive);
        totalChangeToGive = -(quartersToReturn * .25);

        dimesToReturn = calculateDimesToReturn(totalChangeToGive);
        totalChangeToGive = -(dimesToReturn * .10);

        nickelsToReturn = calculateNickelsToReturn(totalChangeToGive);
        totalChangeToGive = -(nickelsToReturn * .05);

        penniesToReturn = calculatePenniesToReturn(totalChangeToGive);
        totalChangeToGive = -(penniesToReturn * .01);

        System.out.println("Your change is: ");
        System.out.println("Dollars: " + dollarsToReturn);
        System.out.println("Quarters: " + quartersToReturn);
        System.out.println("Dimes: " + dimesToReturn);
        System.out.println("Nickels: " + nickelsToReturn);
        System.out.println("Pennies: " + penniesToReturn);

        //give back pennies

    }

    static double subtractItemAmountFromCashReceived(double priceOfTheItem, double totalPaymentReceived) {
        double totalChangeToGive;

        if (totalPaymentReceived >= priceOfTheItem) {
            totalChangeToGive = totalPaymentReceived - priceOfTheItem;
        } else {
            System.out.println("Sorry, that's not enough cash. Please give us MORE");
            totalChangeToGive = 0.00;
        }
        return totalChangeToGive;
    }

    static int calculateTotalDollarsToReturn(double totalChangeToGive) {
        double temporaryChangeToGive = totalChangeToGive;
        int dollarsToReturn = 0;
        do {
            dollarsToReturn = dollarsToReturn + 1;
            temporaryChangeToGive = temporaryChangeToGive - 1.00;
        } while (temporaryChangeToGive >= 1.00);
        return dollarsToReturn;
    }

    static int calculateQuartersToReturn(double totalChangeToGive) {

        double temporaryChangeToGive = totalChangeToGive;
        int quartersToReturn = 0;
        while (temporaryChangeToGive >= 0.25) {
            quartersToReturn = quartersToReturn + 1;
            temporaryChangeToGive = temporaryChangeToGive - 0.25;
        }
        return quartersToReturn;
    }

    static int calculateDimesToReturn(double totalChangeToGive) {
        double temporaryChangeToGive = totalChangeToGive;
        int dimesToReturn = 0;
        while (temporaryChangeToGive >= 0.10) {
            dimesToReturn = dimesToReturn + 1;
            temporaryChangeToGive = temporaryChangeToGive - 0.10;
        }
        return dimesToReturn;
    }

    static int calculateNickelsToReturn(double totalChangeToGive) {
        double temporaryChangeToGive = totalChangeToGive;
        int nickelsToReturn = 0;
        while (temporaryChangeToGive >= 0.05) {
            nickelsToReturn = nickelsToReturn + 1;
            temporaryChangeToGive = temporaryChangeToGive - 0.05;
        }
        return nickelsToReturn;

    }

    static int calculatePenniesToReturn(double totalChangeToGive) {
        double temporaryChangeToGive = totalChangeToGive;
        int penniesToReturn = 0;
        while (temporaryChangeToGive >= 0.01) {
            penniesToReturn = penniesToReturn + 1;
            temporaryChangeToGive = temporaryChangeToGive - 0.01;
        }
        return penniesToReturn;
    }
}
