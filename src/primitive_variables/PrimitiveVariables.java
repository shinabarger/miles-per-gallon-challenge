package primitive_variables;

import java.util.Scanner;

public class PrimitiveVariables {
    public static void main() {
        int num1; // variable to hold our first input
        int num2; // variable to hold our second input
        int answer; // variable to hold our answer

        // Open up the keyboard for user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = keyboard.nextInt();
        System.out.println("Enter second number:");
        num2 = keyboard.nextInt();
        answer = num1 + num2; // simple variable arithmetic
        System.out.println("The answer = " + answer);
        System.out.println("Good job.");
    }

}