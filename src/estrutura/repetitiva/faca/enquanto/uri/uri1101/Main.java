package estrutura.repetitiva.faca.enquanto.uri.uri1101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int n = input.nextInt();
            int m = input.nextInt();

            if (n <= 0 || m <= 0) break;

            int min = Math.min(n, m);
            int max = Math.max(n, m);
            int sum = 0;

            for (int i = min; i <= max; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("Sum=" + sum);
        }

        input.close();
    }
}
