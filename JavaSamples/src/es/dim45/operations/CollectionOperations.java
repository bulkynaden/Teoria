package es.dim45.operations;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public final class CollectionOperations {
    private CollectionOperations() {
    }

    /**
     * Devuelve un Map con cada palabra y la cantidad de veces que aparece.
     * 
     * @param strings Array de palabras que se quiere avaluar.
     * @return Map<String, Integer> con cada palabra distinta y las veces que se
     *         repite.
     */
    public static Map<String, Integer> getWordCountMap(String... strings) {
        return Arrays.stream(strings).collect(Collectors.toMap(s -> s, s -> 1, Integer::sum, HashMap::new));
    }

    /**
     * Devuelve true si las dos listas contienen el elemento pasado como argumento
     * la misma cantidad de veces.
     * 
     * @param <E>   Cualquier objeto
     * @param elem  Elemento que se quiere comprobar
     * @param list1 Collection<E> Una lista con la que se quiere comprobar.
     * @param list2 Collection<E> La otra lista con la que se quiere comprobar.
     * @return Valor booleano determinado por si las dos listas contienen el
     *         elemento
     *         pasado como argumento la misma cantidad de veces o no.
     */
    public static <E> boolean checkTheSameNumberOfTimes(int elem, Collection<E> list1, Collection<E> list2) {
        return list1.stream()
                .filter(e -> e.equals(elem))
                .count() == list2.stream().filter(e -> e.equals(elem)).count();

        // Otra opción
        // return (Collections.frequency(list1, elem) == Collections.frequency(list2,
        // elem));
    }

    /**
     * Devuelve la cantidad de números pares de la lista pasada como argumento
     * 
     * @param list Collection<Integer> de la que se quiere saber la cantidad de
     *             números pares
     * @return cantidad de números pares de la lista pasada como argumento
     */
    public static long getEvenNumbersCount(Collection<Integer> list) {
        return list.stream().filter(num -> num % 2 == 0).count();
    }

    /**
     * Devuelve la cantidad de números impares de la lista pasada como argumento
     * 
     * @param list Collection<Integer> de la que se quiere saber la cantidad de
     *             números impares
     * @return cantidad de números impares de la lista pasada como argumento
     */
    public static long getOddNumbersCount(Collection<Integer> list) {
        return list.stream().filter(num -> num % 2 != 0).count();
    }

    /**
     * Devuelve el elemento más repetido en una lista. Si se encuentran dos o más,
     * devuelve el primero.
     * 
     * @param <E>  Cualquier tipo.
     * @param list Lista de la que se quiere obtener elemento más repetido.
     * @return el elemento más repetido.
     */
    public static <E> E getMaxRepeatedElement(Collection<E> list) {
        E maxElement = null;
        int cantidad;
        int maxCantidad = 0;
        for (E e : list) {
            cantidad = Collections.frequency(list, e);
            if (cantidad > maxCantidad) {
                maxElement = e;
                maxCantidad = cantidad;
            }
        }
        return maxElement;
    }

    /**
     * Devuelve el mínimo elemento de los elementos de la lista.
     * 
     * @param <E>  Cualquier tipo que sea Comparable.
     * @param list Lista de la que se quiere obtener el mínimo elemento.
     * @return el mínimo elemento de los elementos de la lista.
     */
    public static <E extends Comparable<E>> E getMinValue(Collection<E> list) {
        return list.stream().min((s1, s2) -> s1.compareTo(s2)).get();
    }

    /**
     * Devuelve el mayor elemento de los elementos de la lista.
     * 
     * @param <E>  Cualquier tipo que sea Comparable.
     * @param list Lista de la que se quiere obtener el mayor elemento.
     * @return el mayor elemento de los elementos de la lista.
     */
    public static <E extends Comparable<E>> E getMaxValue(Collection<E> list) {
        return list.stream().max((s1, s2) -> s1.compareTo(s2)).get();
    }

    /**
     * Devuelve el String con más carácteres de la colección pasada como argumento.
     * 
     * @param list Collection<String> de la que se quiere obtener la palabra más
     *             larga.
     * @return String con más carácteres de la colección pasada como argumento
     */
    public static String getLongestString(Collection<String> list) {
        return list.stream().max((s1, s2) -> s1.length() - s2.length()).get();

        // Otra opción
        // return list.stream().max(Comparator.comparingInt(String::length)).get();
    }
}
