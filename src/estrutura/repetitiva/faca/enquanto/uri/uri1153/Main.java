package estrutura.repetitiva.faca.enquanto.uri.uri1153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= N; i++) fatorial *= i;
        System.out.println(fatorial);

        input.close();
    }
}
