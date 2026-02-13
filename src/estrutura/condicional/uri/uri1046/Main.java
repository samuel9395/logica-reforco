package estrutura.condicional.uri.uri1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaInicio = input.nextInt();
        int horaFim = input.nextInt();

        int duracao = 0;
        int dia = 24;

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else if (horaInicio > horaFim && horaFim == 0) {
            duracao = dia - horaInicio;
        } else if (horaFim > 0) {
            duracao = dia - horaInicio;
            duracao += horaFim;
        } else {
            duracao = dia;
        }

        if (duracao >= 1 && duracao <= 24) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        }

        input.close();
    }
}
