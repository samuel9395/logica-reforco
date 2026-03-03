package estrutura.condicional.uri.uri1072;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] intervalo = {10, 20};
        int X, in = 0, out = 0;
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            X = input.nextInt();
            if (X >= intervalo[0] && X <= intervalo[1]) in++;
            else out++;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        input.close();
    }
}
