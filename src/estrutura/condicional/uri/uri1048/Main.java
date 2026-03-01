package estrutura.condicional.uri.uri1048;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String percentual = "";
        double reajuste = 0;
        double salario = input.nextDouble();

        if (salario > 2000.00) {
            percentual = "4";
            reajuste = 0.04 * salario;
            salario += reajuste;
        } else if (salario > 1200.00 && salario <= 2000.00) {
            percentual = "7";
            reajuste = 0.07 * salario;
            salario += reajuste;
        } else if (salario > 800.00 && salario <= 1200.00) {
            percentual = "10";
            reajuste = 0.10 * salario;
            salario += reajuste;
        } else if (salario > 400.00 && salario <= 800.00) {
            percentual = "12";
            reajuste = 0.12 * salario;
            salario += reajuste;
        } else {
            percentual = "15";
            reajuste = 0.15 * salario;
            salario += reajuste;
        }

        System.out.printf("Novo salario: %.2f%n", salario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");


        input.close();
    }
}
