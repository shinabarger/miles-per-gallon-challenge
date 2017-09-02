package averager;

import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/2/17.
 */
public class GetAverage {

    public static void main() {
        GetAverage.runInstructions();
    }

    private static void runInstructions() {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        double average = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("We're gonna figure out three numbers. Enter your first number.");
        firstNumber = Integer.parseInt(scan.nextLine());

        System.out.println("Enter your second number: ");
        secondNumber = Integer.parseInt(scan.nextLine());

        System.out.println("Enter your third number to average: ");
        thirdNumber = Integer.parseInt(scan.nextLine());

        average = calculateAverage(firstNumber, secondNumber, thirdNumber);
        System.out.println("Your average is " + average);

    }
    public static double calculateAverage(int firstNumber, int secondNumber, int thirdNumber) {
        double average = (firstNumber + secondNumber + thirdNumber) / 3;
        return average;
    }

}
