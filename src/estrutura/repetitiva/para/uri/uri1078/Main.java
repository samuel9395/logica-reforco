package estrutura.repetitiva.para.uri.uri1078;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("🔢 Digite o número da tabuada: ");
        int N = input.nextInt();

        System.out.println("\n  ┌──────────────────────────┐");
        System.out.printf("  │      TABUADA DO %-3d      │\n", N);
        System.out.println("  ├──────────────────────────┤");

        for (int i = 1; i <= 10; i++) {
            int resultado = i * N;
            System.out.printf("   %2d  x  %d   =   %-6d  \n", i, N, resultado);
        }

        System.out.println("  └──────────────────────────┘");

        input.close();
    }
}

