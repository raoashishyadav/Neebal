package test;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int originalNumber = number;
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, 3);
                number /= 10;
            }

            if (sum == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong Number");
            } else {
                System.out.println(originalNumber + " is not an Armstrong Number");
            }
        } else {
            System.out.println("Invalid input. Please enter a 3-digit number.");
        }

        scanner.close();
    }
}
