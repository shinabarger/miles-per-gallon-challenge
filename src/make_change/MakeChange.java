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
        totalChangeToGive = totalChangeToGive - dollarsToReturn;

        quartersToReturn = calculateQuartersToReturn(totalChangeToGive);

        //give back quarters

        //give back dimes

        //give back nickels

        //give back pennies

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
        do {
            quartersToReturn = quartersToReturn + 1;
            temporaryChangeToGive = temporaryChangeToGive - 0.25;
        } while (temporaryChangeToGive >= 0.25);
        return quartersToReturn;
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

}
