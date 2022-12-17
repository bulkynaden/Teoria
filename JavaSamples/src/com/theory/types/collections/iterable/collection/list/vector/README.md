# Vector

En Java, un `Vector` es una clase de la biblioteca de colecciones que se utiliza para almacenar y acceder a una secuencia de elementos de un tipo específico. Los vectores son similares a los `Arrays` en Java, pero tienen un tamaño dinámico que se puede ajustar dinámicamente durante la ejecución del programa. Además, los vectores ofrecen una serie de métodos que facilitan el manejo de sus elementos.

Ver la clase [java.util.Vector](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Vector.html) para más información.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

## Diferencia con `ArrayList`

`ArrayList` y `Vector` son dos clases de la biblioteca de colecciones de Java que se utilizan para almacenar y acceder a una secuencia de elementos de un tipo específico. Ambas clases proporcionan una serie de métodos para facilitar el manejo de sus elementos y son similares en muchos aspectos. Sin embargo, hay algunas diferencias clave entre `ArrayList` y `Vector` que es importante tener en cuenta al elegir qué clase utilizar en un determinado caso.

- Sincronización: `Vector` es una clase sincronizada, lo que significa que cada método de la clase está protegido por una barrera de sincronización. Esto hace que `Vector` sea más adecuado para uso en multihilos, ya que garantiza que cada hilo tenga acceso exclusivo al vector mientras realiza operaciones sobre él. Por otro lado, `ArrayList` no es sincronizada y, por lo tanto, es más adecuada para uso en un solo hilo o en un entorno donde la sincronización no es necesaria.
- Rendimiento: En términos de rendimiento, `ArrayList` suele ser más rápido que `Vector` debido a que no tiene que realizar la sincronización de métodos. Esto significa que `ArrayList` es más adecuado para aplicaciones que requieren un rendimiento alto y no necesitan sincronización.
- Tamaño inicial: `Vector` y `ArrayList` tienen un tamaño inicial que se utiliza para determinar el tamaño del array interno que se utiliza para almacenar los elementos. `ArrayList` tiene un tamaño inicial predeterminado de 10 elementos, mientras que `Vector` tiene un tamaño inicial de capacidad predeterminado de 1 elemento. Esto significa que `Vector` suele necesitar redimensionar su array interno más a menudo que `ArrayList`, lo que puede afectar el rendimiento de la clase.
- Redimensionado: Cuando se agrega un elemento a un `Vector` o a un `ArrayList` y el array interno se queda sin espacio, se redimensiona automáticamente para ajustarse a la nueva cantidad de elementos. La forma en que se realiza la redimensionación es diferente en `Vector` y `ArrayList`. `Vector` redimensiona su array interno al doble de su tamaño anterior cada vez que se queda sin espacio, mientras que `ArrayList` redimensiona su array al 50% más grande que su tamaño anterior. Esto significa que `Vector` suele tener menos redimensiones que `ArrayList`, lo que puede mejorar el rendimiento en aplicaciones que realizan muchas operaciones de inserción.

## Ejemplos

- `add(E e)`: Agrega un elemento al final del vector.
- `add(int index, E element)`: Agrega un elemento en la posición especificada del vector.
- `addAll(Collection<? extends E> c)`: Agrega todos los elementos de la colección especificada al final del vector.
- `clear()`: Elimina todos los elementos del vector.
- `contains(Object o)`: Devuelve true si el vector contiene el elemento especificado o false en caso contrario.
- `get(int index)`: Devuelve el elemento de la posición especificada

Agregar elementos al final del vector:

```java
Vector<String> names = new Vector<>();
names.add("Juan");
names.add("Ana");
names.add("Pedro");
```

Agregar elementos en una posición específica:

```java
Vector<String> names = new Vector<>();
names.add("Juan");
names.add("Ana");
names.add("Pedro");
names.add(1, "Laura"); // El vector quedaría ["Juan", "Laura", "Ana", "Pedro"]
```

Agregar todos los elementos de una colección a un vector:

```java
Vector<String> names = new Vector<>();
names.add("Juan");
names.add("Ana");
names.add("Pedro");

List<String> moreNames = Arrays.asList("Sofía", "Carlos", "Miguel");
names.addAll(moreNames); // El vector quedaría ["Juan", "Ana", "Pedro", "Sofía", "Carlos", "Miguel"]
```

Eliminar todos los elementos de un vector:

```java
Vector<String> names = new Vector<>();
names.add("Juan");
names.add("Ana");
names.add("Pedro");
names.clear(); // El vector queda vacío
```

Comprobar si un vector contiene un elemento:

```java
Vector<String> names = new Vector<>();
names.add("Juan");
names.add("Ana");
names.add("Pedro");

boolean containsAna = names.contains("Ana"); // containsAna es true
boolean containsMario = names.contains("Mario"); // containsMario es false
```

Acceder a un elemento de un vector:

```java
Vector<String> names = new Vector<>();
names.add("Juan");
names.add("Ana");
names.add("Pedro");

String secondName = names.get(1); // secondName es "Ana"
```