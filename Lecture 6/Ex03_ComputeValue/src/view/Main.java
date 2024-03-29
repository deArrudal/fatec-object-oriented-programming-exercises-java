package view;

import java.util.Scanner;
import controller.Operators;

public class Main {
    public static void main(String[] args) {
        Operators method = new Operators();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter an integer: ");
            try {
                System.out.printf("Result: %.0f\n",
                        method.computeValue(scan.nextInt()));
            } catch (ArithmeticException arithmeticException) {
                System.err.println(arithmeticException.getMessage());
            }

            scan.nextLine();
            System.out.print("Do you wish to continue [y/n]: ");
        } while (scan.nextLine().equals("y"));

        scan.close();
    }
}