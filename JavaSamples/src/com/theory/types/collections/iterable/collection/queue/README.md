# Cola

En Java, una cola es una estructura de datos que permite almacenar elementos secuencialmente y acceder a ellos en orden FIFO (First In, First Out). Esto significa que el primer elemento que se agrega a la cola será el primero en ser eliminado.

Para trabajar con colas en Java, se puede utilizar la interface `Queue`. Esta interface proporciona varios métodos para agregar, eliminar y acceder a los elementos de la cola. Algunos de los métodos más comunes son:

- `offer(E e)`: Agrega un elemento a la cola. Devuelve true si el elemento se ha agregado correctamente o false en caso contrario.
- `poll()`: Elimina y devuelve el primer elemento de la cola. Si la cola está vacía, devuelve null.
- `peek()`: Devuelve el primer elemento de la cola sin eliminarlo. Si la cola está vacía, devuelve null.

También se puede utilizar la clase `LinkedList` como una implementación de la interface `Queue`.

Ver la interfaz [java.util.Queue](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Queue.html) para más información.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)


## Ejemplo
Ejemplo de uso de una cola en Java:

```java
Queue<Integer> queue = new LinkedList<>();

// Agregar elementos a la cola
queue.offer(1);
queue.offer(2);
queue.offer(3);

// Acceder al primer elemento de la cola
int firstElement = queue.peek(); // firstElement = 1

// Eliminar el primer elemento de la cola
int removedElement = queue.poll(); // removedElement = 1
```