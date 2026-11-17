
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read total distance in kilometers
        int distance = scanner.nextInt();

        // Read total fuel used in liters
        double fuel = scanner.nextDouble();

        // Calculate average consumption
        double average = distance / fuel;

        // Print result with 3 decimal places
        System.out.printf("%.3f km/l\n", average);
    }
}
