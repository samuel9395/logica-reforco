package estrutura.repetitiva.faca.enquanto.uri.uri1146;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int X = input.nextInt();
            if (X == 0) break;
            for (int i = 1; i <= X; i++) {
                System.out.print(i);
                if (i % X == 0) System.out.println();
                else System.out.print(" ");
            }
        }

        input.close();
    }
}