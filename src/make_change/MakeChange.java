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
        double quartersToReturn;
        double dimesToReturn;
        double nickelsToReturn;
        double penniesToReturn;
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

    }

    public static double subtractItemAmountFromCashReceived(double priceOfTheItem, double totalPaymentReceived) {
        double totalChangeToGive;

        if(totalPaymentReceived >= priceOfTheItem) {
            totalChangeToGive = totalPaymentReceived - priceOfTheItem;
        } else {
            System.out.println("Sorry, that's not enough cash. Please give us MORE");
            totalChangeToGive = 0.00;
        }
        return totalChangeToGive;
    }

}
