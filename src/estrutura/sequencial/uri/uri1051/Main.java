package estrutura.sequencial.uri.uri1051;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double taxa1, taxa2, taxa3, resto, total;
        double salario = input.nextDouble();

        if (salario > 2000.00 && salario <= 3000.00) {
            resto = salario - 2000.00;
            taxa1 = 0.08 * resto;
            System.out.printf("R$ %.2f%n", taxa1);
        } else if (salario > 3000.00 && salario <= 4500.00) {
            taxa1 = 0.08 * 1000.00;
            resto = salario - 3000.00;
            taxa2 = resto * 0.18;
            total = taxa1 + taxa2;
            System.out.printf("R$ %.2f%n", total);
        } else if (salario > 4500) {
            resto = salario - 4500;
            taxa1 = 0.08 * 1000.00;
            taxa2 = 0.18 *  1500.00;
            taxa3 = 0.28 * resto;
            total = taxa1 + taxa2 +  taxa3;
            System.out.printf("R$ %.2f%n", total);
        }
        else {
            System.out.println("Isento");
        }

        input.close();
    }
}
