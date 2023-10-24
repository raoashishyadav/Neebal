package test;

import java.util.Scanner;

public class ElectricityBillConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the consumer's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        double billAmount = 0;

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 4;
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 4 + (unitsConsumed - 100) * 5;
        } else {
            billAmount = 100 * 4 + 200 * 5 + (unitsConsumed - 300) * 10;
        }
        if (billAmount > 1000) {
            double surcharge = billAmount * 0.05;
            billAmount += surcharge;
        }
        double gst = billAmount * 0.18;
        billAmount += gst;

        System.out.println("Name: " + name);
        System.out.println("Units: " + unitsConsumed);
        System.out.println("Amount: " + billAmount);

        scanner.close();
    }
}

