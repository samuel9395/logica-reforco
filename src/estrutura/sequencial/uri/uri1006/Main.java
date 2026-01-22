package estrutura.sequencial.uri.uri1006;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A, B, C;
        A = input.nextDouble() * 2;
        B = input.nextDouble() * 3;
        C = input.nextDouble() * 5;
        double media = (A + B + C) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        input.close();
    }
}