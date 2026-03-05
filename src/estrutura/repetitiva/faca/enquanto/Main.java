package estrutura.repetitiva.faca.enquanto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        char repetir;

        System.out.println("┌───────────────────────────────────┐");
        System.out.println("│         CONVERSOR Cº -> Fº        │");
        System.out.println("└───────────────────────────────────┘");

        do {
            System.out.print("   Digite a temperatura (ºC): ");
            double celsius = input.nextDouble();
            System.out.println(" ───────────────────────────────────");

            System.out.println("┌───────────────────────────────────┐");
            System.out.printf("│ TEMPERATURA INSERIDA: %7.1f ºC  │\n", celsius);
            System.out.println("└───────────────────────────────────┘");

            double fahrenheit = (celsius * 1.8) + 32;
            System.out.println("┌───────────────────────────────────┐");
            System.out.printf("│ Equivalente em Fahrenheit:%5.1f Fº|%n", fahrenheit);
            System.out.println("└───────────────────────────────────┘");

            System.out.println("Deseja repetir (s/n)?");
            repetir = input.next().charAt(0);
            if (repetir != 's' && repetir != 'n') {
                System.out.println("Dado incorreto! Finalizando...");
                break;
            }
        } while (repetir == 's');

        System.out.println("┌───────────────────────────────────┐");
        System.out.println("│       CONVERSOR FINALIZADO!       │");
        System.out.println("└───────────────────────────────────┘");

        input.close();
    }
}
