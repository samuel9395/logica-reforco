package estrutura.repetitiva.faca.enquanto.uri.uri1116;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X, Y;
        int count = 0;
        int N = input.nextInt();

        do {
            X = input.nextInt();
            Y = input.nextInt();
            double result = (double) X / Y;
            if (X < 0 || Y == 0) System.out.println("divisao impossivel");
            else System.out.printf("%.1f\n", result);
            count++;
        } while (N != count);

        input.close();
    }
}
