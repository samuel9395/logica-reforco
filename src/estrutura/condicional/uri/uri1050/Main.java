package estrutura.condicional.uri.uri1050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int entradaUsuario = input.nextInt();
        System.out.println("Cidade: " + Destino.getDDD(entradaUsuario));

        input.close();
    }
}
