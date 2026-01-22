package estrutura.sequencial.uri.uri1008;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numeroFuncionario = input.nextInt();
        int horasTrabalhadas =  input.nextInt();
        double valorHora = input.nextDouble();
        double salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        input.close();
    }
}
