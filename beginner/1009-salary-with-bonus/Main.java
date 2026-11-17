import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();           // Read the name (not used in calculation)
        double fixedSalary = sc.nextDouble();
        double totalSales = sc.nextDouble();

        double totalSalary = fixedSalary + (totalSales * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", totalSalary);
    }
}
