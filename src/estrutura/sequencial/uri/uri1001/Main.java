package estrutura.sequencial.uri.uri1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Fonte:
         * https://judge.beecrowd.com/pt/problems/view/1001
         */

        Scanner input = new Scanner(System.in);

        int A, B, X;

        A = input.nextInt();
        B = input.nextInt();
        X = A + B;

        System.out.println("X = " + X);

        input.close();
    }
}
