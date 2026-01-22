package estrutura.sequencial.uri.uri1003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A, B;
        A = input.nextInt();
        B = input.nextInt();
        int soma = A + B;

        System.out.println("SOMA = " + soma);

        input.close();
    }
}
