package estrutura.condicional.uri.uri1043;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        float perimetro, area;
        float A = input.nextFloat();
        float B = input.nextFloat();
        float C = input.nextFloat();

        System.out.print(A < (B + C) && B < (C + A) & C < (A + B)
                ? String.format("Perímetro = %.1f\n", perimetro = A + B + C)
                : String.format("Area = %.1f\n", area = ((A + B) * C) / 2));

        input.close();
    }
}
