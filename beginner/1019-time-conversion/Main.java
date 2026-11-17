import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int hours = N / 3600;
        N %= 3600;
        int minutes = N / 60;
        int seconds = N % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
