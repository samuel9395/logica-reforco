package estrutura.condicional.uri.uri1070;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();

        if(X % 2 == 0) X++;
        for (int i = 1; i <= 6; i++) {
            if (X % 2 != 0) {
                System.out.println(X);
                X += 2;
            }
        }

        input.close();
    }
}
