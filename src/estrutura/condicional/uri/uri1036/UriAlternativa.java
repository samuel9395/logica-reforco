package estrutura.condicional.uri.uri1036;

import java.util.Locale;
import java.util.Scanner;

public class UriAlternativa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double delta = Math.pow(B, 2) - 4 * A * C;

        double x1 = (-B + Math.sqrt(delta)) / (2.0 * A);
        double x2 = (-B - Math.sqrt(delta)) / (2.0 * A);

        System.out.printf((A == 0 || delta < 0) ? "Impossível calcular" : "R1 = %.5f%nR2 = %.5f%n", x1, x2);

        sc.close();
    }
}
