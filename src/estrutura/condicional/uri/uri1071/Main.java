package estrutura.condicional.uri.uri1071;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int aux = 0;
        int X = input.nextInt();
        int Y = input.nextInt();

        if (X > Y) for (int i = Y + 1; i < X; i++) if (i % 2 != 0) aux += i;

        System.out.println(aux);

        input.close();
    }
}
