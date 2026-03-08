package estrutura.repetitiva.faca.enquanto.uri.uri1144;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            int quadrado =(int) Math.pow(i, 2);
            int cubo = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d%n", i, quadrado, cubo);
            System.out.printf("%d %d %d%n", i, quadrado + 1, cubo + 1);
        }

        input.close();
    }
}
