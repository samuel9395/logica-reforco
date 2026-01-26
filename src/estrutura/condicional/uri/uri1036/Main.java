package estrutura.condicional.uri.uri1036;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] D = sc.nextLine().split(" ");
        double A = Double.parseDouble(D[0]);
        double B = Double.parseDouble(D[1]);
        double C = Double.parseDouble(D[2]);
        double delta = Math.pow(B, 2) - 4 * A * C;

        double x1 = (-B + Math.sqrt(delta)) / (A+A);
        double x2 = (-B - Math.sqrt(delta)) / (A+A);

        if (A == 0 || delta < 0) {
            System.out.println("Impossível calcular");
        } else {
            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }

        sc.close();
    }
}
