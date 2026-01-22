package estrutura.sequencial.uri.uri1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos, segundos, resto;
        int N = input.nextInt();

        horas = N / 3600;
        resto = N % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        input.close();
    }
}
