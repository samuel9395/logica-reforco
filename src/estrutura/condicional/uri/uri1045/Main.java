package estrutura.condicional.uri.uri1045;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        // Ordenação decrescente (A maior)
        if (B > A) {
            double aux = A;
            A = B;
            B = aux;
        }
        if (C > A) {
            double aux = A;
            A = C;
            C = aux;
        }
        if (C > B) {
            double aux = B;
            B = C;
            C = aux;
        }

        double A2 = A * A;
        double B2 = B * B;
        double C2 = C * C;

        // Verifica se forma triângulo
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.abs(A2 - (B2 + C2)) < 0.0001) System.out.println("TRIANGULO RETANGULO");
            if (A2 > B2 + C2) System.out.println("TRIANGULO OBTUSANGULO");
            if (A2 < B2 + C2) System.out.println("TRIANGULO ACUTANGULO");
            if (A == B && B == C) System.out.println("TRIANGULO EQUILATERO");
            else if (A == B || B == C || A == C) System.out.println("TRIANGULO ISOSCELES");
        }

        input.close();
    }
}
