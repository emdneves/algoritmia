package PL_04.unidades;

public enum UnidadeIngrediente {

    GRAMAS,
    LITROS,
    UNIDADES;

    public static String unidadeIngredienteToString(UnidadeIngrediente unidade)
    {
        return switch (unidade) {
            case GRAMAS -> "artigo em gramas";
            case LITROS -> "artigo em litros";
            case UNIDADES -> "artigo em unidades";
        };
    }
}


