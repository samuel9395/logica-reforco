package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        // objeto do tipo "Scanner" é utilizado para entrada de dados no console
        Scanner sc = new Scanner(System.in);

        String x;
        Double y;
        char z;

        x = sc.nextLine();
        y = sc.nextDouble();
        z = sc.next().charAt(0);

        System.out.println("DADOS DIGITADOS: \n" + x + "\n" + y + "\n" + z);

        // faça sc.close() quando não precisar mais do objeto sc
        sc.close();
    }
}
