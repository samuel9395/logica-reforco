package estrutura.repetitiva.enquanto.uri.uri1134;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║          MENU DE ABASTECIMENTO         ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║  [ 1 ] ÁLCOOL                          ║");
        System.out.println("║  [ 2 ] GASOLINA                        ║");
        System.out.println("║  [ 3 ] DIESEL                          ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║               ABASTECER❓               ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║  [ 0 ] SIM                             ║");
        System.out.println("║  [ 4 ] NÃO                             ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.print("👉 Informe o código do serviço: ");

        int finalizar = 4;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo;
        int opcao = input.nextInt();

        while (opcao != 0 && opcao != 4) {
            System.out.println("❌ OPÇÃO INVÁLIDA!");
            System.out.print("👉 Informe o código do serviço: ");
            opcao = input.nextInt();
        }
        while (opcao != finalizar || opcao == 0) {
            System.out.print("⛽ Abastecer: ");
            codigo = input.nextInt();
            if (codigo == 1) alcool++;
            else if (codigo == 2) gasolina++;
            else if (codigo == 3) diesel++;

            System.out.println("---------------------");
            System.out.println("(1) ⛽ ÁLCOOL = " + alcool);
            System.out.println("(2) ⛽ GASOLINA  = " + gasolina);
            System.out.println("(3) ⛽ DIESEL  = " + diesel);
            System.out.println("---------------------\n");

            System.out.println("---------------------------");
            System.out.println("⛽ Continuar abastecendo? (0-Sim / 4-Não)");
            System.out.print("👉 Opção: ");
            opcao = input.nextInt();
            System.out.println("---------------------------\n");
        }
        System.out.println("\n  ==========================================");
        System.out.println("  ||          FECHAMENTO DE TURNO         ||");
        System.out.println("  ==========================================");
        System.out.println("  DESCRIÇÃO                       QUANTIDADE");
        System.out.println("  ------------------------------------------");
        System.out.printf("  (01) ⛽ ÁLCOOL ..................... [%04d]\n", alcool);
        System.out.printf("  (02) ⛽ GASOLINA ................... [%04d]\n", gasolina);
        System.out.printf("  (03) ⛽ DIESEL ..................... [%04d]\n", diesel);
        System.out.println("  ------------------------------------------");
        System.out.println("  STATUS: SUCESSO         SISTEMA ATUALIZADO");
        System.out.println("  ==========================================");
        System.out.println("  >>>         MUITO OBRIGADO!            <<<\n\n");


        input.close();
    }
}
