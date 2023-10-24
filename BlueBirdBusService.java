package test;
import java.util.Scanner;

public class BlueBirdBusService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of bookings: ");
        int X = scanner.nextInt();

        int peopleTraveling = 50 * (X / 50);

        System.out.println("People Travelling = " + peopleTraveling);

        scanner.close();
    }
}

