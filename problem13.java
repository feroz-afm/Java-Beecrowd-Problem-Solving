import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangle = (A  C)  2;
        double circle = PI  C  C;
        double trapezium = ((A + B)  C)  2;
        double square = B  B;
        double rectangle = A  B;

        System.out.printf(TRIANGULO %.3fn, triangle);
        System.out.printf(CIRCULO %.3fn, circle);
        System.out.printf(TRAPEZIO %.3fn, trapezium);
        System.out.printf(QUADRADO %.3fn, square);
        System.out.printf(RETANGULO %.3fn, rectangle);
    }
}
