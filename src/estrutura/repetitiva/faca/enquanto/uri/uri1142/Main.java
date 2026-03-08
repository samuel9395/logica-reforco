package estrutura.repetitiva.faca.enquanto.uri.uri1142;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int A = 1;
        int B = 2;
        int C = 3;
        int D = A;
        int E = B;
        int F = C;
        int count = 0;

        for (int i = 1; i <= N; i++) {
            count++;
            System.out.printf("%d %d %d PUM\n", D, E, F);
            while (count == 1) {
                D = A + 4;
                E = B + 4;
                F = C + 4;
                A = D;
                B = E;
                C = F;
                count = 0;
            }
        }

        input.close();
    }
}
