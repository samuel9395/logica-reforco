package estrutura.sequencial.uri.uri1013;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X, Y;
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        Y = (A + B + Math.abs(A-B))/2;
        X = (Y + C + Math.abs(Y-C))/2;

        System.out.println(X + " eh o maior");

        input.close();
    }
}
