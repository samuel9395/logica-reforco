package estrutura.sequencial.uri.uri1017;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidadeMedia = sc.nextInt();
        double litros = (double) tempo * velocidadeMedia / 12;
        System.out.printf("%.3f\n", litros);

        sc.close();
    }
}
