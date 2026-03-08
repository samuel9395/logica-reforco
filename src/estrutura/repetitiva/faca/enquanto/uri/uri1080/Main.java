package estrutura.repetitiva.faca.enquanto.uri.uri1080;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = 0;
        int position = 0;
        for (int i = 1; i <= 10; i++) {
            int number = input.nextInt();
            if (number > max) {
                max = number;
                position = i;
            }
        }
        System.out.println(max);
        System.out.println(position);

        input.close();
    }
}
