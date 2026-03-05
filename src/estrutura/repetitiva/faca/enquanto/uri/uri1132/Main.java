package estrutura.repetitiva.faca.enquanto.uri.uri1132;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min, max, X, Y;
        int resultado = 0;

        X = input.nextInt();
        Y = input.nextInt();

        if (Y < X) {
            min = Y;
            max = X;
        } else {
            min = X;
            max = Y;
        }

        int count = min;
        do {
            if (count % 13 >= 1) resultado += count;
            count++;
        } while (count <= max);
        System.out.println(resultado);

        input.close();
    }
}
