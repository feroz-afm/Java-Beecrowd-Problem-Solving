import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(); // Distance in kilometers
        int time = d * 2;
        System.out.println(time + " minutos");
    }
}
