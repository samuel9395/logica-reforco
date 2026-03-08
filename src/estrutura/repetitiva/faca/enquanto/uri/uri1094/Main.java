package estrutura.repetitiva.faca.enquanto.uri.uri1094;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;
        int total = 0;
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            int qtd = input.nextInt();
            char tipo = input.next().charAt(0);
            switch (tipo) {
                case 'C':
                    coelhos += qtd;
                    break;
                case 'R':
                    ratos += qtd;
                    break;
                case 'S':
                    sapos += qtd;
                    break;
            }
            total += qtd;
        }
        double perCentCoelho = (coelhos / (double) total) * 100;
        double perCentRato = (ratos / (double) total) * 100;
        double perCentSapo = (sapos / (double) total) * 100;

        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", perCentCoelho);
        System.out.printf("Percentual de ratos: %.2f %%\n", perCentRato);
        System.out.printf("Percentual de sapos: %.2f %%\n", perCentSapo);

        input.close();
    }
}
