package estrutura.sequencial.uri.uri1004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A, B;
        A = input.nextInt();
        B = input.nextInt();

        int PROD = A * B;
        System.out.println("PROD = " + PROD);

        input.close();
    }
}
