package testes;

public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"24/7", "várias camadas", "30.000 pés", "B-to-B", "todos ganham"};
        String[] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado", "central"};
        String[] wordListTree = {"processo", "ponto máximo", "solução", "arquitetura", "habilitação no núcleo"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int treeLength = wordListTree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * treeLength);

        String phrase = wordListOne[rand1] + " " +  wordListTwo[rand2] + " " + wordListTree[rand3];

        System.out.println("Precisamos de " + phrase);
    }
}
