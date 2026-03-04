package estrutura.repetitiva.uri.uri1134;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║          MENU DE ABASTECIMENTO         ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║  [ 1 ] ÁLCOOL      [ 2 ] GASOLINA      ║");
        System.out.println("║  [ 3 ] DIESEL      [ 4 ] FINALIZAR     ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.print("👉 Informe o código do serviço: ");

        int finalizar = 4;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo = input.nextInt();

        while (codigo != finalizar) {
            if (codigo == 1) alcool++;
            else if (codigo == 2) gasolina++;
            else if (codigo == 3) diesel++;
            codigo = input.nextInt();
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
        System.out.println("  >>>         MUITO OBRIGADO!            <<<");


        input.close();
    }
}
