package estrutura.condicional.uri.uri1065;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X = 0, Y = 0, Z = 0, A = 0;
        for (int i = 1; i <= 5; i++) {
            double numero = input.nextDouble();
            if (numero % 2 == 0) Y++;
            if (numero % 2 != 0) X++;
            if (numero > 0) Z++;
            if (numero < 0) A++;
        }
        System.out.println(Y + " valor(es) par(es)");
        System.out.println(X + " valor(es) impar(es)");
        System.out.println(Z + " valor(es) positivo(s)");
        System.out.println(A + " valor(es) negativo(s)");

        input.close();
    }
}
