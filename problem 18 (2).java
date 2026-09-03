import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

        int[] notes = {100, 50, 20, 10, 5, 2, 1};

        for (int note : notes) {
            int count = n / note;
            System.out.println(count + " nota(s) de R$ " + note + ",00");
            n %= note;
        }
    }
}
