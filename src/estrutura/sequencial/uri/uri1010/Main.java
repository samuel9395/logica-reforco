package estrutura.sequencial.uri.uri1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codigoPeca, numeroPecas;
        double valorUnitario;
        double valorTotal = 0.0;

        for (int i = 0; i < 2; i++) {

            String[] dadosPeca = input.nextLine().split(" ");
            numeroPecas = Integer.parseInt(dadosPeca[1]);
            valorUnitario = Double.parseDouble(dadosPeca[2]);
            valorTotal += valorUnitario * numeroPecas;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        input.close();
    }
}
