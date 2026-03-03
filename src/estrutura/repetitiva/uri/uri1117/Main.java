package estrutura.repetitiva.uri.uri1117;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int notasValidas = 0;
        double soma = 0;

        while (notasValidas < 2) {
            double nota = input.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                notasValidas++; // Só aumenta quando a nota é boa
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = soma / 2;
        System.out.printf("media = %.2f%n", media);

        input.close();
    }
}
