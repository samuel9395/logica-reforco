package testes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        addNames();
    }

    public static void addNames() {
        List<Names> listNames = new ArrayList<>();

        listNames.add(new Names("John", "Doe"));
        listNames.add(new Names("Jane", "Doe"));
        listNames.add(new Names("Bob", "Shaun"));
        listNames.add(new Names("Rita", "Lee"));

        for (Names names : listNames) {
            System.out.println(names.toString());
        }

        System.out.println("-------------------------");

        System.out.println(listNames.get(3).toString());
    }
}

//        System.out.println("Digite 1 para somar ou 2 para subtrair");
//
//        int i = in.nextInt();
//        System.out.println(i == 1 ? "soma" : "subtração");
//
//        System.out.println("Digite os valores");
//        int n1 = in.nextInt();
//        int n2 = in.nextInt();
//
//        System.out.println(i == 1 ? "SUM: " + (n1 + n2) : "SUB: " + (n1 - n2));

/**
 * int A = 2;
 * int B = 10;
 * int C = 2;
 * <p>
 * for (int i = A; i <= B; i += C) System.out.println(i);
 */

/**
 * int num = 9;
 * <p>
 * for (int i = 1; i <= num; i++) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print(i + " ");
 * }
 * System.out.println();
 * }
 */