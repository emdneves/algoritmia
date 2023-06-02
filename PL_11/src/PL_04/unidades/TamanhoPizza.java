package PL_04.unidades;

public enum TamanhoPizza
{
    PEQUENA,
    MEDIA,
    GRANDE;

    public static String tamanhoPizzaToString(tamanhoPizza size)
    {
        return switch (size) {
            case PEQUENA -> " Pizza pequena.";
            case MEDIA -> " Pizza media.";
            case GRANDE -> " Pizza grande.";
        };
    }
}

