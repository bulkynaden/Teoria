# Collection
Esta interfaz es “la raíz” de todas las interfaces y clases relacionadas con colecciones de elementos. Java no define ninguna implementación de esta interface y son respectivamente sus subinterfaces las que implementarán sus métodos.

Una colección es de manera genérica un grupo de objetos llamados elementos. Esta interfaz por tanto será usada para pasar colecciones de elementos o manipularlos de la manera más general deseada.

En Java, se emplea la interface genérica Collection para este propósito. Gracias a esta interface, podemos almacenar cualquier tipo de objeto y podemos usar una serie de métodos comunes, como pueden ser: añadir, eliminar, obtener el tamaño de la colección… ya que se trata de métodos definidos por la interface que obligatoriamente han de implementar las subinterfaces o clases que hereden de ella.

Ver la interfaz [java.util.Collection](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html) para más información.

Además, Java proporciona la clase [java.util.Collections](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html) con métodos para ayudarnos con las colecciones. [Ver resumen de los métodos](#clase-collections)

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

## Métodos

### parallelStream()
Crea un Stream paralelo de la colección.

#### Ejemplo
```java
List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
listOfNumbers.parallelStream().forEach(System.out::print);
```
> Imprime "3421" ya que al ser en paralelo no se puede controlar el orden de cada hilo y puede variar cada vez que se ejecute

### removeIf(Predicate<? super E> filter)
Elimina todos los elementos de la colección que cumplan el predicado.

#### Ejemplo 1
```java
List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(3, 1, 2, 6, 4, 7, 2));
listOfNumbers.removeIf(n -> n < 4); // Quito los números menores a 4
listOfNumbers.forEach(System.out::print);
```
> Imprime "647"


#### Ejemplo 2
```java
List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(3, 1, 2, 6, 4, 7, 2));
listOfNumbers.removeIf(n -> (n % 2 != 0)); // Quito los números impares
listOfNumbers.forEach(System.out::print);
```
> Imprime "2642"

#### Ejemplo 3
```java
List<String> listOfNumbers = new ArrayList<>(Arrays.asList("Hola", "Adios", "Hello"));
listOfNumbers.removeIf(n -> n.startsWith("H")); // Quito los String que empiecen por "H"
listOfNumbers.forEach(System.out::print);
```
> Imprime "Adios"

### spliterator()
Crea un Splitterator sobre los elementos de la colección.

### stream()
Crea un Stream de la colección.

### toArray(IntFunction<T[]> generator)
Devuelve un array con todos los elementos de la colección.

#### Ejemplo 1
```java
Collection<?> lista = Arrays.asList("Hola", "Qué tal", "Adios");
Object[] listaString = lista.toArray(); // Si no se pasa argumento, devuelve Object[]
System.out.println(listaString[1]);
```
> Imprime "Qué tal"

#### Ejemplo 2
```java
Collection<?> lista = Arrays.asList("Hola", "Qué tal", "Adios");
String[] listaString = lista.toArray(String[]::new); // Para especificar el tipo del Array
System.out.println(listaString[1]);
```
> Imprime "Qué tal"

## Clase Collections

Métodos de la clase java.util.Collections:

| Método                                           | Descripción                                                                    |
|--------------------------------------------------|--------------------------------------------------------------------------------|
| addAll(Collection<? super T> c, T... elements) | Agrega todos los elementos especificados a la colección |
| asLifoQueue(Deque<T> deque)                           | Devuelve una `Queue` (LIFO) del `Deque` pasado como argumento |
| binarySearch( * ) | Busca en la colección un elemento usando "Binary Search" |
| checked... | Devuelve una colección "typesafe" |
| copy(List<? super T> dest, List<? extends T> src) | Copia los valores de una lista en otra |
| disjoint(Collection<?> c1, Collection<?> c2) | Devuelve `true` si las dos colecciones no tienen elementos en común |
| empty... | Devuelve un tipo inmutable |
| enumeration(Collection<T> c) | Devuelve un `Enumeration` de la colección pasada como argumento |
| fill(List<? super T> list, T obj) | Reemplaza todos los elementos de una lista con el elemento pasado |
| frequency(Collection<?> c, Object o) | Devuelve el número de elementos en la colección que son iguales al objeto pasado |
| indexOfSubList(List<?> source, List<?> target) | Devuelve el índice donde se encuentra una lista dentro de otra |
| lastIndexOfSubList(List<?> source, List<?> target) | Devuelve el índice de la última coincidencia de la lista especificada en otra |
| list(Enumeration<T> e) | Devuelve un `ArrayList` con los elementos devueltos por la enumeración |
| max(Collection<? extends T> coll, Comparator<? super T> comp) | Devuelve el elemento máximo de una colección de acuerdo al `Comparator` o el orden natural |
| min(Collection<? extends T> coll, Comparator<? super T> comp) | Devuelve el elemento mínimo de una colección de acuerdo al `Comparator` o el orden natural |
| nCopies(int n, T o) | Devuelve una `List` con n elementos del objeto pasado |
| newSetFromMap(Map<E,Boolean> map) | Devuelve un `Set` del `Map` pasado |
| replaceAll(List<T> list, T oldVal, T newVal) | Reemplaza todos los elementos específicos por otro valor |
| reverseOrder(Comparator<T> cmp) | Devuelve un `Comparator` con el orden inverso del `Comparator` especificado o del orden natural |
| rotate(List<?> list, int distance) | Rota los elementos en la lista la distancia especificada |
| shuffle(List<?> list) | Desordena la lista |
| singleton(T o) | Devuelve un `Set` inmutable con el objeto especificado |
| singletonList(T o) | Devuelve una `List` inmutable con el objeto especificado |
| singletonMap(K key, V value) | Devuelve una `Map` con la clave y el valor especificado |
| sort(List<T> list | Ordena una lista con el orden natural |
| sort(List<T> list, Comparator<? super T> c) | Ordena una lista con el `Comparator` pasado |
| swap(List<?> list, int i, int j) | Intercambia los elementos de las posiciones especificadas |
| synchronized... | Devuelve una colección sincronizada |
| unmodifiable... | Devuelve una vista inmodificable de la colección pasada. |

