package estrutura.condicional.uri.uri1064;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double X = 0;
        int Y = 0;
        for (int i = 1; i <= 6; i++) {
            double numero = input.nextDouble();
            if (numero >= 0) {
                Y++;
                X += numero;
            }
        }
        double media = X / Y;
        System.out.println(Y + " valores positivos");
        System.out.printf("%.1f\n", media);

        input.close();
    }
}
