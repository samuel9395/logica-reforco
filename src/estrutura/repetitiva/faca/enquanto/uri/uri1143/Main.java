package estrutura.repetitiva.faca.enquanto.uri.uri1143;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            int aux = (int) Math.pow(i, 2);
            int X = i * aux;
            System.out.printf("%d %d %d\n", i, aux, X);
        }

        input.close();
    }
}
