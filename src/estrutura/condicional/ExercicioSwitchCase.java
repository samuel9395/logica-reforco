package estrutura.condicional;

import java.util.Scanner;

public class ExercicioSwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String dia;
        int diaSemana = input.nextInt();

        switch (diaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido!";
        }

        System.out.println("Dia da semana: " + dia);

        input.close();
    }
}
