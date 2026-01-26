package estrutura.condicional;

import java.util.Scanner;

public class OperadorAtribuicaoAcumulativa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double planoBasico = 50.00;
        int minutos = input.nextInt();

        if (minutos > 100) planoBasico += (minutos - 100) * 2.0;

        System.out.printf("Valor a pagar: R$ %.2f\n", planoBasico);

        input.close();
    }
}
