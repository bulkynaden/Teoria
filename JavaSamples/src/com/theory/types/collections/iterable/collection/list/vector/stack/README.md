# Stack

`Stack` es una clase de la biblioteca de colecciones de Java que se utiliza para implementar una estructura de datos llamada "pila" (stack en inglés). Una pila es una estructura de datos de tipo "último en entrar, primero en salir" (Last-In, First-Out, LIFO) que permite agregar y eliminar elementos solo en un extremo de la pila, conocido como "tope" (top). Las operaciones más comunes que se realizan en una pila son:

- `push`:` agregar un elemento al tope de la pila.
- `pop`: eliminar el elemento que se encuentra en el tope de la pila.
- `peek`: obtener el elemento que se encuentra en el tope de la pila sin eliminarlo.
- `empty`: comprobar si la pila está vacía.

Ver la clase [java.util.Stack](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Stack.html) para más información.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

## Ejemplos

Crear una pila y agregar elementos:

```java
Stack<String> names = new Stack<>();
names.push("Juan");
names.push("Ana");
names.push("Pedro");

names.pop(); // la pila ahora es ["Juan", "Ana"]
```

Obtener el elemento en el tope de la pila sin eliminarlo:

```java
Stack<String> names = new Stack<>();
names.push("Juan");
names.push("Ana");
names.push("Pedro");

String top = names.peek(); // top es "Pedro"
```

Eliminar el elemento en el tope de la pila:

```java
Stack<String> names = new Stack<>();
names.push("Juan");
names.push("Ana");
names.push("Pedro");

names.pop(); // la pila ahora es ["Juan", "Ana"]
```

Comprobar si la pila está vacía:

```java
Stack<String> names = new Stack<>();

if (names.empty()) {
    System.out.println("La pila está vacía.");
} else {
    System.out.println("La pila no está vacía.");
}
```