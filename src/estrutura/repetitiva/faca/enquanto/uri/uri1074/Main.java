package estrutura.repetitiva.faca.enquanto.uri.uri1074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        int N = input.nextInt();

        do {
            int codigo = input.nextInt();
            if (codigo > 0 && codigo % 2 == 0) System.out.println("EVEN POSITIVE");
            else if (codigo < 0 && codigo % 2 == 0) System.out.println("EVEN NEGATIVE");
            else if (codigo > 0 && codigo % 2 != 0) System.out.println("ODD POSITIVE");
            else if (codigo < 0 && codigo % 2 != 0) System.out.println("ODD NEGATIVE");
            else System.out.println("NULL");
            count++;
        } while (N != count);

        input.close();
    }
}
