package estrutura.condicional.uri.uri1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String resultado = "";
        String palavraUm = input.nextLine();
        String palavraDois = input.nextLine();
        String palavraTres = input.nextLine();

        if (palavraUm.equals("vertebrado")) {
            if (palavraDois.equals("ave")) {
                if (palavraTres.equals("carnivoro")) {
                    resultado = "aguia";
                } else if (palavraTres.equals("onivoro")) {
                    resultado = "pomba";
                }
            } else if (palavraDois.equals("mamifero")) {
                if (palavraTres.equals("onivoro")) {
                    resultado = "homem";
                } else if (palavraTres.equals("herbivoro")) {
                    resultado = "vaca";
                }
            }
        } else if (palavraUm.equals("invertebrado")) {
            if (palavraDois.equals("inseto")) {
                if (palavraTres.equals("hematofago")) {
                    resultado = "pulga";
                } else if (palavraTres.equals("herbivoro")) {
                    resultado = "lagarta";
                }
            } else if (palavraDois.equals("anelideo")) {
                if (palavraTres.equals("hematofago")) {
                    resultado = "sanguessuga";
                } else if (palavraTres.equals("onivoro")) {
                    resultado = "minhoca";
                }
            }
        }

        System.out.println(resultado);

        input.close();
    }
}
