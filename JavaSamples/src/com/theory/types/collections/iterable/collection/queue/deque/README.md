# Deque
En Java, una cola doble (también conocida como `deque`) es una estructura de datos que **permite agregar y eliminar elementos desde ambos extremos**. Las colas dobles combinan las reglas de acceso proporcionadas por las colas (FIFO) y las pilas (LIFO). Las colas dobles son útiles en situaciones específicas donde se requiere acceder tanto al primer como al último elemento. Hay dos tipos de colas dobles: las de acceso restringido de entrada, donde solo se puede insertar en un extremo y eliminar desde ambos, y las de acceso restringido de salida, donde se puede insertar desde ambos extremos pero solo se puede eliminar desde uno. 

En Java, se puede utilizar la interface `Deque` de la biblioteca de colecciones para trabajar con colas dobles y la clase `LinkedList` como una implementación de esta interface. Algunos de los métodos más comunes de la interface `Deque `son: 
- `offerFirst(E e)`, `offerLast(E e)` para agregar elementos a la cola.
- `pollFirst()`, `pollLast()` para eliminar elemento.
- `peekFirst()`, `peekLast()` para acceder al primer o último elemento sin eliminarlo. 

Las colas dobles son útiles para implementar otras estructuras de datos, como colas y pilas, y para almacenar el historial de un navegador web, entre otras aplicaciones.

Ver la interfaz [java.util.Deque](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Deque.html) para más información.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)