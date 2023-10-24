package test;
import java.util.Scanner;

public class daysconverter {
 
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        if (totalDays >= 0) {
            int years = totalDays / 365;
            int remainingDays = totalDays % 365;
            int months = remainingDays / 30;
            remainingDays %= 30;
            int weeks = remainingDays / 7;
            int days = remainingDays % 7;

            System.out.println("Converted time: " + years + " Years : " + months + " Months : " + weeks + " Weeks : " + days + " Days");
        } else {
            System.out.println("Invalid input. Please enter a non-negative number of days.");
        }

        scanner.close();
    }
}
