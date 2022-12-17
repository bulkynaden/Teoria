# Collections

Las colecciones en Java permiten almacenar y manipular grupos de objetos. Permiten buscar, 
ordenar, insertar, editar y eliminar.

Java provee de diferentes interfaces y clases para trabajar con las colecciones.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

## [Iterable (I)](iterable/) 
Al implementar esta interfaz, permite a un objeto ser recorrido con forEach().

### [Collection (I)](iterable/collection/)
Esta interfaz es “la raíz” de todas las interfaces y clases relacionadas con colecciones de elementos. 

#### [List (I)](iterable/collection/list/)
Esta interface es la encargada de agrupar una colección de elementos en forma de lista, es decir, uno detrás de otro. En una lista los elementos pueden ser accedidos por un índice que indica la posición del elemento en la colección.

##### [ArrayList (O)](iterable/collection/list/arraylist/)
La clase `ArrayList` en Java, es una clase que permite almacenar datos en memoria de forma similar a los Arrays, con la ventaja de que el numero de elementos que almacena, lo hace de forma dinámica.

##### LinkedList (O)

##### Vector (O)

###### Stack (O)

#### [Queue (I)](iterable/collection/queue/)

##### PriorityQueue (O)

##### Deque (I)

###### ArrayDeque (O)

#### [Set (I)](iterable/collection/set/)
Esta interface es la encargada de agrupar una colección de elementos que **no permite repetición**
> ¿Qué clase utilizar? La clase `HashSet` está muy optimizada para almacenar elementos, pero no garantiza ningún orden. La clase `TreeSet` garantiza el orden de los elementos, pero es más "lenta". La case `LinkedHashSet` mantiene el orden de los elementos según son insertados, es un punto intermedio entre `HashSet` y `TreeSet`.

##### [HashSet (O)](iterable/collection/set/hashset/)
La clase `HashSet` representa un set como una tabla de hash. Utiliza los hash code de los elementos para almacenarlos. No garantiza ningún orden de los elementos ni que sea constante en el tiempo.

##### LinkedHashSet (O)

##### SortedSet (I)

###### [TreeSet (O)](iterable/collection/set/sortedset/treeset/)
La clase `TreeSet` representa un set que nos garantiza el orden de los elementos. El orden de los elementos será el orden natural de los elementos o por la implementación del `Comparator` específico.

##### EnumSet (O)

## [Map (I)](map/)
Un `Map` es una colección de pares `key-value` o `clave-valor`. Las claves son únicas aunque los valores pueden repetirse.

### [HashMap (O)](map/hashmap/)
La clase `HashMap` representa un mapa como si fuera un `Hashtable`. Proporciona rendimiento constante para los métodos `put` y `get` asumiendo que la función `hash` dispersa los elementos correctamente.

### [LinkedHashMap (O)](map/linkedhashmap)
La clase `LinkedHashMap` almacena los elementos en el orden que son insertados.

### SortedMap (I)

#### TreeMap (O)

### [Hashtable (O)](map/hashtable/)
La clase `Hashtable` representa una estructura de datos que utiliza una función hash para identificar datos mediante una clave. La función hash transforma una clave a un valor índice de un array de elementos. Cada entrada del `Hashtable` es un `bucket` que pueden almacenar 0 o más valores.



