package estrutura.sequencial.uri.uri1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        int notaCem = valor / 100;
        int restoCem = valor % 100;
        int notaCinquenta = restoCem / 50;
        int restoCinquenta = restoCem % 50;
        int notaVinte = restoCinquenta / 20;
        int restoVinte = restoCinquenta % 20;
        int notaDez = restoVinte / 10;
        int restoDez = restoVinte % 10;
        int notaCinco = restoDez / 5;
        int restoCinco = restoDez % 5;
        int notaDois = restoCinco / 2;
        int restoDois = restoCinco % 2;
        int notaUm = restoDois / 1;

        System.out.printf("%d\n%d nota(s) de R$ 100,00\n", valor, notaCem);
        System.out.printf("%d nota(s) de R$ 50,00\n", notaCinquenta);
        System.out.printf("%d nota(s) de R$ 20,00\n", notaVinte);
        System.out.printf("%d nota(s) de R$ 10,00\n", notaDez);
        System.out.printf("%d nota(s) de R$ 5,00\n", notaCinco);
        System.out.printf("%d nota(s) de R$ 2,00\n", notaDois);
        System.out.printf("%d nota(s) de R$ 1,00\n", notaUm);

        input.close();
    }
}
