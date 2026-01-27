package estrutura.condicional.uri.uri1041;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float X = sc.nextFloat();
        float Y = sc.nextFloat();

        if (X == 0 && Y != 0) System.out.println("Eixo Y");
        if (X != 0 && Y == 0) System.out.println("Eixo X");
        if (X == 0 && Y == 0) System.out.println("Origem");

        if (X > 0.0f && Y > 0.0f) System.out.println("Q1");
        else if (X < 0.0f && Y > 0.0f) System.out.println("Q2");
        else if (X < 0.0f && Y < 0.0f) System.out.println("Q3");
        else if (X > 0.0f && Y < 0.0f) System.out.println("Q4");

        sc.close();
    }
}
