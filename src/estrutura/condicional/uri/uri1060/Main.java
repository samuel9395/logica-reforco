package estrutura.condicional.uri.uri1060;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int Y = 0;
        for (int i = 1; i <= 6; i++) {
            double numero = input.nextDouble();
            if (numero >= 0) Y++;
        }
        System.out.println(Y + " valores positivos");

        input.close();
    }
}
