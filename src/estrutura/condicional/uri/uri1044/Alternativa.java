package estrutura.condicional.uri.uri1044;

import java.util.Scanner;

public class Alternativa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        System.out.println((A % B == 0 || B % A == 0) ?"Sao Multiplos" : "Nao sao Multiplos");

        input.close();
    }
}
