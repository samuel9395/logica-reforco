package estrutura.sequencial.uri.uri1021;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();
        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int i : notas) {
            int qtdNotas = (int) (valor / i);
            valor %= i;
            System.out.printf("%d nota(s) de R$ %d.00%n", qtdNotas, i);
        }

        System.out.println("MOEDAS:");
        for (double j : moedas) {
            int qtdMoedas = (int) (valor / j);
            valor %= j;
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtdMoedas, j);
        }

        input.close();
    }
}
