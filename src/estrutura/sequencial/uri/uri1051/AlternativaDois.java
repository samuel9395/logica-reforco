package estrutura.sequencial.uri.uri1051;

import java.util.Locale;
import java.util.Scanner;

public class AlternativaDois {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double salario = input.nextDouble();
        double imposto = 0.0;

        if (salario > 4500.00) {
            imposto += (salario - 4500.00) * 0.28;
            salario = 4500.00;
        }
        if (salario > 3000.00) {
            imposto += (salario - 3000.00) * 0.18;
            salario = 3000.00;
        }
        if (salario > 2000.00) {
            imposto += (salario - 2000.00) * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        input.close();
    }
}
