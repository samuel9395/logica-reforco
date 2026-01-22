package estrutura.sequencial;

import java.util.Locale;

public class ExercicioResolvidoUm {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double largura = 10.0;
        double comprimento = 30.0;
        double metroQuadrado = 200.00;

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.println("Entrada:");
        System.out.printf(
                "Largura: %.1f" +
                "\nComprimento: %.1f" +
                "\nPreço por m²: %.2f\n\n",
                largura, comprimento, metroQuadrado
        );
        System.out.println("Saída:");
        System.out.printf("AREA = %.2f\n", area);
        System.out.printf("PRECO = %.2f\n", preco);
    }
}
