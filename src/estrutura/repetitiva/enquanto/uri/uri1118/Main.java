package estrutura.repetitiva.enquanto.uri.uri1118;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X = 0;
        int count = 0;
        double sum = 0;
        String nome = "";

        System.out.println("  ┌────────────────────────────────┐");
        System.out.println("  │         MENU DE OPÇÕES         │");
        System.out.println("  ├────────────────────────────────┤");
        System.out.println("  │ 1. Registrar a nota do aluno   │");
        System.out.println("  │ 2. Encerrar o sistema          │");
        System.out.println("  └────────────────────────────────┘");
        System.out.print("  👉 Selecione uma opção: ");
        X = input.nextInt();
        input.nextLine();
        if (X == 1) {
            System.out.print("  👉 Digite o nome do alunoª: ");
            nome = input.nextLine();
        }

        while (X != 2) {
            System.out.print("  📝 Digite a nota: ");
            double nota = input.nextDouble();
            if (nota < 0 || nota > 10) System.out.println("  ❌ Nota invalida!");
            else {
                count++;
                sum += nota;
                if (count == 2) {
                    double media = (double) sum / count;

                    // Painel de Resultado Semestral
                    System.out.printf("\n  🎓 ALUNOª: %s   ", nome);
                    System.out.println("\n  ┌─────────────────────────────┐");
                    System.out.println("  │      RELATÓRIO DO ALUNO     │");
                    System.out.println("  ├─────────────────────────────┤");
                    System.out.printf("  │ 🎓 MÉDIA SEMESTRAL: %7.2f │\n", media);
                    System.out.println("  └─────────────────────────────┘");

                    sum = 0;
                    count = 0;

                    System.out.println("\n  Novo cálculo? (1-Sim / 2-Não)");
                    System.out.print("  👉 Opção: ");
                    X = input.nextInt();
                    input.nextLine();
                    if (X == 1) {
                        System.out.print("  👉 Digite o nome do alunoª: ");
                        nome = input.nextLine();
                    }
                    if (X < 1 || X > 2) {
                        while (X != 1 && X != 2) {
                            System.out.println("\n  Novo cálculo? (1-Sim / 2-Não)");
                            System.out.print("  👉 Opção: ");
                            X = input.nextInt();
                        }
                    }
                }
            }
        }

        System.out.println("\n  SISTEMA ENCERRADO. ATÉ LOGO! 👋🏼");

        input.close();
    }
}
