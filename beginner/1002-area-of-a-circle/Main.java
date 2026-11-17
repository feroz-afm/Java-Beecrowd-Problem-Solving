import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        
        double R = sc.nextDouble();
        double A = PI * R * R;

        // Format to 4 decimal places
        System.out.printf("A=%.4f\n", A);
    }
}
