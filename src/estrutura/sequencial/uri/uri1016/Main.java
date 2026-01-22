package estrutura.sequencial.uri.uri1016;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();
        int minutos = 2;
        int tempo = distancia * minutos;

        System.out.printf("%d minutos\n", tempo);

        sc.close();
    }
}