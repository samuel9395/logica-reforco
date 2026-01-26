package estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvidoUm {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double notaSemestreUm = sc.nextDouble();
        double notaSemestreDois = sc.nextDouble();
        double notaFinal = notaSemestreUm + notaSemestreDois;

        if (notaFinal < 60.00) System.out.printf("NOTA FINAL = %.1f%n*** REPROVADO ***\n-----------------", notaFinal);
        else System.out.printf("NOTA FINAL = %.1f%n*** APROVADO ***\n----------------", notaFinal);

        // Resposta alternativa
//        System.out.println((notaFinal < 60.00)
//                ? "NOTA FINAL = " + notaFinal + "\nREPROVADO"
//                :"NOTA FINAL = " + notaFinal + "\nAPROVADO");

        sc.close();
    }
}
