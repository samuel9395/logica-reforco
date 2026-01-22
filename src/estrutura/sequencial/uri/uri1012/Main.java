package estrutura.sequencial.uri.uri1012;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double triangulo = A * C / 2;
        double circulo = Math.PI * Math.pow(C, 2);
        double trapezio = (A + B) * C / 2;
        double quadrado = Math.pow(B, 2);
        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        input.close();
    }
}
