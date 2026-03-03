package estrutura.repetitiva.uri.uri1114;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int senha = 2002;
        int tentativa = input.nextInt();

        while (tentativa != senha) {
            System.out.println("Senha Invalida");
            tentativa = input.nextInt();
        }
        System.out.println("Acesso Permitido");

        input.close();
    }
}
