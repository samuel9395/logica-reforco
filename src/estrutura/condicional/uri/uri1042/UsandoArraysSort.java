package estrutura.condicional.uri.uri1042;

import java.util.Arrays;
import java.util.Scanner;

public class UsandoArraysSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] original = new int[3];
        int[] ordenado = new int[3];

        for (int i = 0; i < 3; i++) {
            original[i] = input.nextInt();
            ordenado[i] = original[i];

            if (i == i ) throw new IllegalArgumentException("'Error: os números digitados são iguais!'");
        }

        Arrays.sort(ordenado);
        for (int num : ordenado) System.out.println(num);

        System.out.println();
        for (int num : original) System.out.println(num);

        input.close();
    }
}
