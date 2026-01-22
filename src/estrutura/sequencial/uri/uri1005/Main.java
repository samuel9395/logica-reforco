package estrutura.sequencial.uri.uri1005;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A, B;
        A = input.nextDouble() * 3.5;
        B = input.nextDouble() * 7.5;
        double media = (A + B ) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

        input.close();
    }
}
