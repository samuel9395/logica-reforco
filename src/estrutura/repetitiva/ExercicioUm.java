package estrutura.repetitiva;

import java.util.Scanner;

// URI 1113
public class ExercicioUm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();

        while (X != Y) {
            if (X < Y) System.out.println("Crescente");
            else System.out.println("Decrescente");
            X = input.nextInt();
            Y = input.nextInt();
        }

        input.close();
    }
}
