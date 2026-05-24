package estrutura.repetitiva.faca.enquanto.uri.uri1158;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            int resultado = 0;
            int X = input.nextInt();
            int Y = input.nextInt();
            for (int j = 0; j < Y; j++) {
                if (X % 2 == 0) {
                    X++;
                    resultado += X;
                } else resultado += X;

                X += 2;
            }
            System.out.println(resultado);
        }

        input.close();
    }
}
