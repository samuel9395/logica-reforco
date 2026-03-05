package estrutura.repetitiva.enquanto.uri.uri1131;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X = 0;
        int countA = 0;
        int countB = 0;
        int countEmp = 0;
        int countGame = 0;
        String msg = "";

        System.out.println("  ┌──────────────────────────────┐");
        System.out.println("  │       MENU DE OPERAÇÃO       │");
        System.out.println("  ├──────────────────────────────┤");
        System.out.println("  │   1. Registrar Novo GRENAL   │");
        System.out.println("  │   2. Encerrar e Ver Placar   │");
        System.out.println("  └──────────────────────────────┘");
        System.out.print("  👉 Selecione uma opção: ");
        X = input.nextInt();

        while (X != 2) {
            countGame++;
            System.out.print("  ⚽ Gols INTER: ");
            int gremio = input.nextInt();
            System.out.print("  ⚽ Gols GREMIO: ");
            int inter = input.nextInt();
            if (gremio > inter) countA++;
            else if (gremio < inter) countB++;
            else countEmp++;
            System.out.println("\n  Novo grenal? (1-Sim / 2-Não)");
            System.out.print("  👉 Opção: ");
            X = input.nextInt();
        }

        if (countA > countB) msg = "🏆 Inter 🏆";
        else if (countA < countB) msg = "🏆 Gremio 🏆";
        else msg = "Sem vencedor 🦓";

        System.out.println();
        System.out.println("  ┌──────────────────────────────┐");
        System.out.println("    ⚽ ESTATÍSTICAS DO CLÁSSICO   ");
        System.out.println("  ├──────────────────────────────┤");
        System.out.println("  │ 🏟️ Grenais:               " + countGame + "  │");
        System.out.println("  ├──────────────────────────────┤");
        System.out.println("  │ 🔴 Inter:                 " + countA + "  │");
        System.out.println("  │ 🔵 Gremio:                " + countB + "  │");
        System.out.println("  │ ❌ Empate:                " + countEmp + "  │");
        System.out.println("  ├──────────────────────────────┤");
        System.out.println("            " + msg.toUpperCase() + "         ");
        System.out.println("  └──────────────────────────────┘");

        input.close();
    }
}
