# List
Esta interface es la encargada de agrupar una colección de elementos en forma de lista, es decir, uno detrás de otro. En una lista los elementos pueden ser accedidos por un índice que indica la posición del elemento en la colección.

Ver la interfaz [java.util.List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html) para más información.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

## Métodos estáticos

### copyOf(Collection<? extends E> coll)

Crea una copia inmutable de la colección pasada como argumento.

#### Ejemplo

```java
Collection<?> lista = Arrays.asList("Hola", "Qué tal", "Adios");
List<?> listaCopiada = List.copyOf(lista);
// listaCopiada.add("Error"); // Da error
```

### of( * )
Crea una copia inmutable del array

#### Ejemplo
```java
List<?> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
// lista.add(2); // Da error
```

## Métodos de instancia

### replaceAll(UnaryOperator<E> operator)
Reemplaza cada elemento de la lista con el resultado de aplicar el operador a ese elemento.

#### Ejemplo
```java
List<Integer> list = Arrays.asList(1, 3, 5, 8);
list.replaceAll(o -> o * 2);
```
> Imprime: 2, 6, 10, 16

### sort(Comparator<? super E> c)
Ordena la lista de acuerdo al `Comparator` pasado. Si es null, ordena por el orden natural

#### Ejemplo 1
```java
List<Integer> list = Arrays.asList(5, 4, 8, 2, 7);
list.sort(null);
list.forEach(System.out::println);
```
> Imprime: 2, 4, 5, 7, 8

#### Ejemplo 2
```java
List<Integer> list = Arrays.asList(5, 4, 8, 2, 7);
list.sort((o1, o2) -> o2 - o1);
list.forEach(System.out::println);
```
> Imprime: 8, 7, 5, 4, 2

### spliterator()
Crea un `Spliterator` de los elementos de la lista.

#### Ejemplo
```java
List<Integer> list = Arrays.asList(3, 2, 5, 6, 8);
Spliterator<Integer> parte1 = list.spliterator(); // Creo el Spliterator
Spliterator<Integer> parte2 = parte1.trySplit(); // Divido el Spliterator
parte2.forEachRemaining(System.out::println); // Imprimo una parte
System.out.println("x".repeat(15)); // Imprimo una división de texto
parte1.forEachRemaining((a) -> {
    a *= 10; // Multiplico por 10 cada elemento de la parte2
    System.out.println(a); // Imprimo cada elemento
});
```
> Imprime: 3 2 xxxxxxxxxxxxxxx 50 60 80
