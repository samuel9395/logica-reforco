package estrutura.repetitiva.uri.uri1154;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int idade = input.nextInt();

        while (idade >= 0) {
            sum += idade;
            count++;
            idade = input.nextInt();
        }
        double media = (double) sum / count;
        System.out.printf("%.2f%n", media);

        input.close();
    }
}
