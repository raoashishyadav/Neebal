package test;
import java.util.Scanner;

public class swappingnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        if (number >= 1000 && number <= 9999) {
            int firstHalf = number / 100;
            int secondHalf = number % 100;

            // Swap the halves and combine them
            int swappedNumber = (secondHalf * 100) + firstHalf;

            System.out.println("Swapped number: " + swappedNumber);
        } else {
            System.out.println("Invalid input. Please enter a 4-digit number.");
        }

        scanner.close();
    }
}
