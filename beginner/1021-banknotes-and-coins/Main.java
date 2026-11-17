import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();

        int[] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int note : notes) {
            int count = (int) (value / note);
            System.out.printf("%d nota(s) de R$ %.2f%n", count, (double) note);
            value -= count * note;
        }

        value = Math.round(value * 100); // convert to cents to avoid floating errors

        System.out.println("MOEDAS:");
        for (double coin : coins) {
            int coinInCents = (int) (coin * 100);
            int count = (int) (value / coinInCents);
            System.out.printf("%d moeda(s) de R$ %.2f%n", count, coin);
            value -= count * coinInCents;
        }

        sc.close();
    }
}
