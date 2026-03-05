package estrutura.repetitiva.faca.enquanto.uri.uri1079;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int count = 0;
        double p1, p2, p3, soma, media, pesos;
        int N = input.nextInt();

        do {
            count++;
            p1 = input.nextDouble() * 2;
            p2 = input.nextDouble() * 3;
            p3 = input.nextDouble() * 5;
            soma = p1 + p2 + p3;
            pesos = 10;
            media = soma / pesos;
            System.out.printf("%.1f\n", media);
        } while (N != count);

        input.close();
    }
}
