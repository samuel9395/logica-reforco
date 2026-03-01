package estrutura.condicional.uri.uri1047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dia = 86400; // 1 dia
        int umaHora = 3600; // 1 hora
        int umMinuto = 60; // 1 umMinuto

        int horaInicio = input.nextInt();
        int minutoInicio = input.nextInt();
        int horaFim = input.nextInt();
        int minutoFim = input.nextInt();

        int inicioEmSegundos = (horaInicio * umaHora) + (minutoInicio * umMinuto);
        int fimEmSegundos = (horaFim * umaHora) + (minutoFim * umMinuto);

        int diferenca = fimEmSegundos - inicioEmSegundos;

        if (diferenca <= 0) {
            diferenca += dia;
        }

        int horas = diferenca / umaHora;
        int minutos = (diferenca % umaHora) / umMinuto;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        input.close();
    }
}
