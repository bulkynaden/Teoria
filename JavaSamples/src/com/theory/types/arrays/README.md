# Arrays

Los arrays sirven para almacenar múltiples valores en una única variable. Son de tamaño fijo una vez
creados.

Java proporciona la clase [java.util.Arrays](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html)
con métodos para ayudarnos con los Arrays.

## Declaración

```java
String[] miArray = new String[4];
String[] miArrayConDatos = { "Hola", "Adios", "pepe", "4", "5", "Alba", "paco" };
```

## Recorrer un array

### Ejemplo 1

```java
for (int i = 0; i < miArrayConDatos.length; i++) {
    miArrayConDatos[i]; 
}
```

### Ejemplo 2

```java
for (String dato : miArrayConDatos) {
    dato;
}
```

## Métodos de la clase java.util.Arrays

| Método                                           | Descripción                                                                    |
|--------------------------------------------------|--------------------------------------------------------------------------------|
| asList(T... a)                                   | Devuelve una lista con los elementos del array pasado                          |
| binarySearch( * )                                | Realiza la búsqueda binaria de un elemento en un array *(debe estar ordenado)* |
| compare( * )                                     | Compara los arrays pasados como argumento                                      |
| copyOf( * )                                      | Copia el array pasado como argumento en otro nuevo array                       |
| copyOfRange( * )                                 | Copia el rango de un array en una nueva copia                                  |
| deepEquals(Object[] a1, Object[] a2)             | Devuelve true si los dos objetos son iguales (multidimensional)                |
| deepHashCode(Object[] a)                         | Devuelve el hash code (multidimensional)                                       |
| deepToString(Object[] a)                         | Devuelve la representación en string del array (multidimensional)              |
| equals( * )                                      | Devuelve true si los arrays pasados son iguales                                |
| fill ( * )                                       | Llena un array con un valor pasado                                             |
| hashCode( * )                                    | Devuelve el hash code del array pasado                                         |
| mismatch( * )                                    | Devuelve la posición del primer elemento distinto o -1                         |
 | parallelPrefix(T[] array , BinaryOperator<T> op) | Acumula todos los elementos del array usando la función pasada (en paralelo)   |
 | parallelSetAll(T[] array, Function<T> generator  | Modifica todos los elementos del array usando la función pasada (en paralelo)  |
 | parallelSort ( * )                               | Ordena en paralelo el array pasado                                             |
 | setAll(T[] array, Function<T> generator)         | Modifica todos los elementos del array usando la función pasada                |

[Más funciones](/src/es/dim45/operations/ArrayOperations.java)