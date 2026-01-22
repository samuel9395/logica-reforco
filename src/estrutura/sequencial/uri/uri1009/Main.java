package estrutura.sequencial.uri.uri1009;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeVendedor = sc.next();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();
        double totalSalario = (0.15 * totalVendas) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f\n", totalSalario);

        sc.close();
    }
}
