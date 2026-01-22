package estrutura.sequencial.uri.uri1061;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicioDia, horaInicio, minutoInicio, segundoInicio, fimDia, horaFim, minutoFim, segundoFim, resto, duracao, inicio, fim, W, X, Y, Z;
        String descricao;

        System.out.print("Dia ");
        inicioDia = input.nextInt();
        input.nextLine();
        String[] A = input.nextLine().split(" : ");
        System.out.print("Dia ");
        fimDia = input.nextInt();
        input.nextLine();
        String[]  B = input.nextLine().split(" : ");

        horaInicio = Integer.parseInt(A[0]);
        minutoInicio = Integer.parseInt(A[1]);
        segundoInicio = Integer.parseInt(A[2]);
        horaFim = Integer.parseInt(B[0]);
        minutoFim = Integer.parseInt(B[1]);
        segundoFim = Integer.parseInt(B[2]);

        inicio = inicioDia*24*60*60 + horaInicio*60*60 + minutoInicio*60 + segundoInicio;
        fim = fimDia*24*60*60 + horaFim*60*60 + minutoFim*60 + segundoFim;
        duracao = fim -  inicio;

        W = duracao / (24*60*60);
        resto = duracao % (24*60*60);
        X = resto / (60*60);
        resto = resto % (60*60);
        Y = resto / 60;
        Z = resto % 60;

        System.out.println(W + " dia(s)");
        System.out.println(X + " hora(s)");
        System.out.println(Y + " minuto(s)");
        System.out.println(Z + " segundo(s)");

        input.close();
    }
}