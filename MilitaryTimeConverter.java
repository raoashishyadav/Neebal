package test;

import java.util.Scanner;

public class MilitaryTimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4-digit military time: ");
        int militaryTime = scanner.nextInt();

        if (militaryTime >= 0 && militaryTime <= 2359) {
            int hours = militaryTime / 100;
            int minutes = militaryTime % 100;
            String period = "AM";

            if (hours >= 12) {
                period = "PM";
                if (hours > 12) {
                    hours -= 12;
                }
            }

            String formattedTime = String.format("%02d:%02d%s", hours, minutes, period);
            System.out.println("12-hour time format: " + formattedTime);
        } else {
            System.out.println("Invalid input. Please enter a 4-digit military time between 0000 and 2359.");
        }

        scanner.close();
    }
}

