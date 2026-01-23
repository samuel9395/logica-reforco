package estrutura.condicional.uri.uri1036;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1, x2, raiz;

        String[] D = sc.nextLine().split(" ");
        double A = Double.parseDouble(D[0]);
        double B = Double.parseDouble(D[1]);
        double C = Double.parseDouble(D[2]);
        double Δ = Math.pow(B, 2) - 4 * A * C;

        raiz = Math.sqrt(Δ);
        x1 = (-B + raiz) / (A+A);
        x2 = (-B - raiz) / (A+A);

        if (A == 0 || Δ < 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }

        sc.close();
    }
}