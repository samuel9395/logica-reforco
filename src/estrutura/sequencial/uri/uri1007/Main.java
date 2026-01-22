package estrutura.sequencial.uri.uri1007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A, B, C, D;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        int diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);

        input.close();
    }
}
