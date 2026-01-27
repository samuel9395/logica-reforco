package estrutura.condicional.uri.uri1038;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double total = 0;
        String item = "";

        System.out.println("|=================================|");
        System.out.println("|       *** DOCA-MASTER ***       |");
        System.out.println("|=================================|");
        System.out.println("|CODIGO  ESPECIFICAÇÃO     PREÇO  |");
        System.out.println("|1       Cachorro Quente   R$ 4.00|");
        System.out.println("|2       X-Salada          R$ 4.50|");
        System.out.println("|3       X-Bacon           R$ 5.00|");
        System.out.println("|4       Torrada simples   R$ 2.00|");
        System.out.println("|5       Refrigerante      R$ 1.50|");
        System.out.println("|---------------------------------|\n");

        System.out.println("Digite o código e a quantidade do produto: ");
        int codigo = input.nextInt();
        int quantidade = input.nextInt();

        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                item = "Cachorro Quente";
                break;
            case 2:
                total = quantidade * 4.50;
                item = "X-Salada";
                break;
            case 3:
                total = quantidade * 5.00;
                item = "X-Bacon";
                break;
            case 4:
                total = quantidade * 2.00;
                item = "Torrada simples";
                break;
            case 5:
                total = quantidade * 1.50;
                item = "Refrigerante";
                break;
            default:
                System.out.println("ERRO");
                break;
        }

        System.out.println("-----------------------------------");
        System.out.println("     --- NOTA FISCAL SIMPLES ---   ");
        System.out.println("-----------------------------------");
        System.out.printf("Item: %s%n", item);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Total: R$ %.2f%n", total);
        System.out.println("-----------------------------------");

        input.close();
    }
}
