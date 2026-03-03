package estrutura.condicional.uri.uri1073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d^2 = %.0f\n", i, Math.pow(i, 2));
            }
        }

        input.close();
    }
}
