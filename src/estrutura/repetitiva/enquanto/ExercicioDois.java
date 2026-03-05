package estrutura.repetitiva.enquanto;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int count = 0;

        if (idade < 0) System.out.println("impossível calcular");
        else {
            while (idade >= 0) {
                soma += idade;
                count++;
                idade = sc.nextInt();
            }
            double media = (double) soma / count;
            System.out.printf("%.2f%n", media);
        }

        sc.close();
    }
}
