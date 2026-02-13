package estrutura.condicional.uri.uri1044;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int aux = 1;
        int A = input.nextInt();
        int B = input.nextInt();

        for (int i = 0; i <= B; i++) {
            aux = A * i;
            if (aux == B) {
                A = aux;
                break;
            }
        }

        System.out.println((A % B == 0 || B == A && A == B) ? "Sao Multiplos" : "Nao sao Multiplos");

        input.close();
    }
}
