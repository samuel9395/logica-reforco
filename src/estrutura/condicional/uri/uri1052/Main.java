package estrutura.condicional.uri.uri1052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        System.out.println(Mes.getMes(valor));

        input.close();
    }

    enum Mes {

        JAN(1, "January"),
        FEB(2, "February"),
        MAR(3, "March"),
        APR(4, "April"),
        MAY(5, "May"),
        JUN(6, "June"),
        JUL(7, "July"),
        AUG(8, "August"),
        SEP(9, "September"),
        OCT(10, "October"),
        NOV(11, "November"),
        DEC(12, "December");

        private int id;
        private String mes;

        Mes(int id, String mes) {
            this.id = id;
            this.mes = mes;
        }

        public static Object getMes(int id) {
            for (Mes m : Mes.values()) {
                if (id == m.id) return m.mes;
            }
            return "Valor invalido!";
        }
    }
}
