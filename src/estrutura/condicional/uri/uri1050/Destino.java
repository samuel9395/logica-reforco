package estrutura.condicional.uri.uri1050;

public enum Destino {

    BRASILIA(61, "Brasilia"),
    SALVADOR(71, "Salvador"),
    SAO_PAULO(11, "Sao Paulo"),
    RIO_DE_JANEIRO(21, "Rio de Janeiro"),
    JUIZ_FORA(32, "Juiz de Fora"),
    CAMPINAS(19, "Campinas"),
    VITORIA(27, "Vitoria"),
    BELO_HORIZONTE(31, "Belo Horizonte");

    private final int ddd;
    private final String cidade;

    Destino(int ddd, String cidade) {
        this.ddd = ddd;
        this.cidade = cidade;
    }

    public static String getDDD(int valor) {
        for (Destino d : Destino.values()) {
            if (d.ddd == valor) {
                return d.cidade;
            }
        }
        return "DDD não cadastrado!";
    }

}
