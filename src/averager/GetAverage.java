package averager;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/2/17.
 */
public class GetAverage {

    public static void main() {
        GetAverage.runInstructions();
    }

    private static void runInstructions() {
        double firstNumber;
        double secondNumber;
        double thirdNumber;
        String average;

        Scanner scan = new Scanner(System.in);

        System.out.println("We're gonna figure out three numbers. Enter your first number.");
        firstNumber = scan.nextDouble();

        System.out.println("Enter your second number: ");
        secondNumber = scan.nextDouble();

        System.out.println("Enter your third number to average: ");
        thirdNumber = scan.nextDouble();

        average = calculateAverage(firstNumber, secondNumber, thirdNumber);
        System.out.println("Your average is " + average);

    }
    public static String calculateAverage(double firstNumber, double secondNumber, double thirdNumber) {
        double average = (firstNumber + secondNumber + thirdNumber) / 3;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        average = Double.parseDouble(decimalFormat.format(average));
        return String.valueOf(average);
    }

}
