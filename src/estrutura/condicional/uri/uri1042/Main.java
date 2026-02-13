package estrutura.condicional.uri.uri1042;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b || a == c || b == c) throw new IllegalArgumentException("Error: os números digitados são iguais!");
        else {

            if (a > b && a > c) {

                if (b > c) System.out.println(c + "\n" + b + "\n" + a);
                else if (b < c) System.out.println(b + "\n" + c + "\n" + a);

            } else if (b > a && b > c) {

                if (a > c) System.out.println(c + "\n" + a + "\n" + b);
                else if (a < c) System.out.println(a + "\n" + c + "\n" + b);

            } else if (c > b && c > a) {
                if (b > a) System.out.println(a + "\n" + b + "\n" + c);
                else if (b < a) System.out.println(b + "\n" + a + "\n" + c);
            }

            System.out.println();
            System.out.println(a + "\n" + b + "\n" + c);
        }

        input.close();
    }
}
