package es.dim45.operations;

public final class ArrayOperations {
  private ArrayOperations() {
  }

  /**
   * Busca en un array un elemento concreto. Si lo encuentra, devuelve su posición, sino,
   * devuelve -1.
   *
   * @param array   Array donde se desea buscar el elemento.
   * @param element Elemento a buscar.
   * @param <T>     Cualquier tipo.
   * @return índice del elemento buscado en el Array. Devuelve -1 si no lo encuentra.
   */
  public static <T> int search(T[] array, T element) {
    int i = 0;
    while (i < array.length && !element.equals(array[i])) {
      i++;
    }
    return (i < array.length) ? i : -1;
  }

  /**
   * Invierte el Array pasado como parámetro.
   *
   * @param <T>   Cualquier tipo.
   * @param array Array que se desea invertir.
   */
  public static <T> void reverse(T[] array) {
    int maxIndex = array.length - 1;
    int halfIndex = array.length / 2;
    for (int i = 0; i < halfIndex; i++) {
      T temp = array[i];
      array[i] = array[maxIndex - i];
      array[maxIndex - i] = temp;
    }
  }

  /**
   * Ordena de manera ascendente el array pasado como parámetro.
   *
   * @param <T>   Cualquier tipo que sea comparable.
   * @param array Array que se desea ordenar.
   */
  public static <T extends Comparable<T>> void sort(T[] array) {
    boolean flag = true;
    T temp;
    while (flag) {
      flag = false;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i].compareTo(array[i + 1]) > 0) {
          temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          flag = true;
        }
      }
    }
  }

  /**
   * Ordena de manera descendente el array pasado como parámetro.
   *
   * @param <T>   Cualquier tipo que sea comparable.
   * @param array Array que se desea ordenar.
   */
  public static <T extends Comparable<T>> void sortReverse(T[] array) {
    boolean flag = true;
    T temp;
    while (flag) {
      flag = false;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i].compareTo(array[i + 1]) < 0) {
          temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          flag = true;
        }
      }
    }
  }

  /**
   * Función para devolver el menor valor en un Array.
   *
   * @param <T>   Cualquier tipo que sea comparable.
   * @param array Array del que se desea obtener el mínimo.
   * @return Menor valor del Array.
   */
  public static <T extends Comparable<T>> T minimunElement(T[] array) {
    T min = null;
    if (array.length > 0) {
      min = array[0];
      for (T valor : array) {
        if (min.compareTo(valor) > 0) {
          min = valor;
        }
      }
    }
    return min;
  }

  /**
   * Función para devolver el mayor valor en un Array.
   *
   * @param <T>   Cualquier tipo que sea comparable.
   * @param array Array del que se desea obtener el máximo.
   * @return Mayor valor del Array.
   */
  public static <T extends Comparable<T>> T maximumElement(T[] array) {
    T min = null;
    if (array.length > 0) {
      min = array[0];
      for (T valor : array) {
        if (min.compareTo(valor) < 0) {
          min = valor;
        }
      }
    }
    return min;
  }
}