package estrutura.repetitiva.para;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            int N2 = input.nextInt();
            sum += N2;
        }
        System.out.println(sum);

        input.close();
    }
}
