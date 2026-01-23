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

        System.out.println((notaFinal < 60.00)
                ? "NOTA FINAL = " + notaFinal + "\nREPROVADO"
                :"NOTA FINAL = " + notaFinal + "\nAPROVADO");

//        if (notaFinal < 60.00) System.out.printf("NOTA FINAL = %.2f%nREPROVADO", notaFinal);
//        else System.out.printf("NOTA FINAL = %.2f%nAPROVADO", notaFinal);

        sc.close();
    }
}
