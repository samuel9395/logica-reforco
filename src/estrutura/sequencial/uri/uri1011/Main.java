package estrutura.sequencial.uri.uri1011;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int raio = sc.nextInt();
        double volume = (4/3.0) * Math.PI * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }
}
