package estrutura.sequencial.uri.uri1020;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ano, mes, dia;
        int valor = input.nextInt();

        ano = valor / 365;
        valor %= 365;
        mes = valor / 30;
        dia = valor % 30;
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        input.close();
    }
}
