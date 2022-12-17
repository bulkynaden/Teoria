package es.dim45.operations;

public final class StringOperations {
    private StringOperations() {
    }

    /**
     * Devuelve la cantidad de vocales de los String pasados como argumento.
     * 
     * @param text Strings de los que se quiere obtener la cantidad de vocales.
     * @return La cantidad de vocales
     */
    public static int getVowelsCount(String... text) {
        int count = 0;
        for (String string : text) {
            count += string.replaceAll("(?i)[^aeiouAEIOUáéíóúÁÉÍÓÚ]", "").length();
        }
        return count;
    }

    /**
     * Devuelve una nueva cadena con cada carácter doblado.
     *
     * @param text la cadena de entrada
     * @return una nueva cadena con cada carácter doblado
     */
    public static String toDoubledCharacters(String text) {
        return text.replaceAll("(.)", "$1$1");
    }

    /**
     * Devuelve una nueva cadena con cualquier carácter doble eliminado.
     *
     * @param text la cadena de entrada
     * @return una nueva cadena con cualquier carácter doble eliminado
     */
    public static String removeDoubledCharacters(String text) {
        String output = " ";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != text.charAt(output.length() - 1)) {
                output += ch;
            }
        }
        return output.substring(1);
    }
}
