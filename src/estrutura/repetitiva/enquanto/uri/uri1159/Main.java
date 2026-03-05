package estrutura.repetitiva.enquanto.uri.uri1159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();

        while (X != 0) {
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                if (X % 2 == 0) {
                    sum += X;
                    X += 2;
                } else {
                    X += 1;
                    i -= 1;
                }
            }
            System.out.printf("IDADE MÉDIA = %02d\n", sum);
            X = input.nextInt();
        }

        input.close();
    }
}
