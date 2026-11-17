import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();   // Time in hours
        int speed = sc.nextInt();  // Speed in km/h

        double distance = time * speed;
        double fuel = distance / 12.0;

        System.out.printf("%.3f\n", fuel);
    }
}
