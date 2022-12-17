package es.dim45.helpers;

public final class Validations {
    private Validations() {

    }

    /**
     * Devuelve un valor booleano especificando si el String pasado es una matrícula
     * válida o no.
     * Una matrícula válida debe cumplir el siguiente formato: 0000-BBB.
     * No admite vocales, ni `LL` ni `CH`.
     * 
     * @param input String que se desea comrpobar
     * @return boolean si el String pasado es una matrícula válida.
     */
    public static boolean isPlate(String input) {
        String regex = "^[0-9]{4}[-](?!.*(LL|CH))[BCDFGHJKLMNPRSTVWXYZ]{3}$";
        return input.matches(regex);
    }

    /**
     * Devuelve un valor booleano especificando si el String pasado es un valor
     * decimal válido o no.
     * La separación de los decimales debe ser con "," o ".".
     * 
     * @param input String que se desea comrpobar
     * @return boolean si el String pasado es valor decimal válido.
     */
    public static boolean isDecimal(String input) {
        String regex = "^-?\\d+([,.]\\d+)?$";
        return input.matches(regex);
    }

    /**
     * Devuelve un valor booleano especificando si el String pasado es un entero
     * válido o no.
     * 
     * @param input String que se desea comrpobar
     * @return boolean si el String pasado es un entero.
     */
    public static boolean isNumber(String input) {
        String regex = "^-?\\d+$";
        return input.matches(regex);
    }

    /**
     * Devuelve un valor booleano especificando si el String pasado es un ISBN
     * válido o no.
     * 
     * @param input String que se desea comrpobar
     * @return boolean si el String pasado es un ISBN.
     */
    public static boolean isISBN(String input) {
        String regex = "^(?=(?:[^0-9]*[0-9]){13}[^0-9]*$)(?=97[89]-[0-9]{1,5}-[0-9]{1,7}-[0-9]{1,6}-[0-9]$)|^(?=97[89][0-9]{10}$)";
        return input.matches(regex);
    }

    /**
     * Devuelve un valor booleano especificando si el String pasado es un email
     * válido o no.
     * 
     * @param input String que se desea comrpobar
     * @return boolean si el String pasado es un email.
     */
    public static boolean isEmail(String input) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return input.matches(regex);
    }

    /**
     * Devuelve un valor boolean especificando si el String pasado es un número
     * entero comprendido entre los valores especificados.
     * 
     * @param num      String con el número entero a evaluar
     * @param minValue Valor mínimo.
     * @param maxValue Valor máximo
     * @return boolean si el String con el número entero está comprendido entre el
     *         minValue y el maxValue
     */
    public static boolean isNumInRange(String num, int minValue, int maxValue) {
        boolean valid = true;
        try {
            if (minValue > Integer.parseInt(num) || Integer.parseInt(num) > maxValue) {
                valid = false;
            }
        } catch (Exception e) {
            valid = false;
        }
        return valid;
    }

    /**
     * Devuelve un valor boolean especificando si el número a evaluar está
     * comprendido entre los valores especificados.
     * 
     * @param num      Número entero a evaluar
     * @param minValue Valor mínimo.
     * @param maxValue Valor máximo
     * @return boolean si el número a evaluar está comprendido entre el
     *         minValue y el maxValue
     */
    public static boolean isNumInRange(int num, int minValue, int maxValue) {
        boolean valid = true;
        if (minValue > num || num > maxValue) {
            valid = false;
        }
        return valid;
    }

    /**
     * Devuelve un valor boolean especificando si el String pasado es una URL
     * válida.
     * 
     * @param input String a evaluar.
     * @return boolean si el String es una URL válida.
     */
    public static boolean isUrl(String input) {
        String regex = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";
        return input.matches(regex);
    }

    /**
     * Devuelve un valor boolean especificando si el String pasado es una IP válida
     * 
     * @param input String a evaluar.
     * @return boolean si el String es una IP válida.
     */
    public static boolean isIpv4(String input) {
        String regex = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return input.matches(regex);
    }

    /**
     * Devuelve un valor booleano que indica si un número entero largo es un
     * palíndromo.
     *
     * @param input el número entero largo de entrada
     * @return `true` si el número de entrada es un palíndromo, `false` en caso
     *         contrario
     */
    public static boolean isPalindromic(long input) {
        long num = input;
        long reversed = 0;
        while (num != 0) {
            // get last digit from num
            long digit = num % 10;
            reversed = reversed * 10 + digit;
            // remove the last digit from num
            num /= 10;
        }
        return input == reversed;
    }

    /**
     * Devuelve un valor booleano que indica si una cadena es un palíndromo.
     *
     * @param input la cadena de entrada
     * @return `true` si la cadena de entrada es un palíndromo, `false` en caso
     *         contrario
     */
    public static boolean isPalindromic(String input) {
        StringBuilder sb = new StringBuilder(input);
        return input.equals(sb.reverse().toString());
    }
}
