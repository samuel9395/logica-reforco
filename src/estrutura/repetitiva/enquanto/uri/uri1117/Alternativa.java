package estrutura.repetitiva.enquanto.uri.uri1117;

import java.util.Locale;
import java.util.Scanner;

public class Alternativa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A = 0, B = 0, media = 0;
        int validade = 0;

        while (validade != 2) {
            double notaUm = input.nextDouble();
            double notaDois = input.nextDouble();
            if (notaUm < 0 || notaUm > 10 || notaDois < 0 || notaDois > 10) {
                System.out.println("nota invalida");
            }
            if (notaUm >= 0 && notaUm <= 10) {
                A += notaUm;
                validade++;
            }
            if (notaDois >= 0 && notaDois <= 10) {
                B += notaDois;
                validade++;
            }
        }
        media = (A + B) / 2;
        System.out.printf("media = %.2f%n", media);

        input.close();
    }

}
