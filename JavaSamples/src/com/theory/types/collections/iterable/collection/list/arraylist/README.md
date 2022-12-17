# ArrayList
La clase ArrayList en Java, es una clase que permite almacenar datos en memoria de forma similar a los Arrays, con la ventaja de que el numero de elementos que almacena, lo hace de forma dinámica.

Ver la clase [java.util.ArrayList](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html) para más información.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)


## Constructores

```java
ArrayList<String> defaultArrayList = new ArrayList<>(); // Constructor por defecto
ArrayList<String> sizedArrayList = new ArrayList<>(50); // Con capacidad inicial
ArrayList<String> loadedArrayList = new ArrayList<>(Arrays.asList("Hola", "Adios")); // Con los datos de otra colección
```

<details>
<summary><h2>Métodos</h2></summary>

<details>
<summary><h3>add</h3></summary>

### add(int index, E element)

Añade un elemento en el índice especificado. **Debe estar dentro de la capacidad del `ArrayList`.** 
Si se omite el índice, lo añade al final del `ArrayList`.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>();
newArrayList.add("Hola");
newArrayList.add("Adios");
newArrayList.add(1, "Qué tal");
newArrayList.forEach(System.out::println);
```
> Imprime: "Hola", "Qué tal", "Adios"
</details>

<details>
<summary><h3>addAll</h3></summary>

### addAll(int index, Collection<? extends E> c)

Añade una colección en el índice especificado. **Debe estar dentro de la capacidad del `ArrayList`.** 
Si se omite el índice, la añade al final del `ArrayList`.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola"));
ArrayList<String> otherArrayList = new ArrayList<>(Arrays.asList("Qué tal", "Adios"));
newArrayList.addAll(otherArrayList);
newArrayList.forEach(System.out::println);
```
> Imprime: "Hola", "Qué tal", "Adios"
</details>

<details>
<summary><h3>clear</h3></summary>

### clear()

Elimina todos los elementos del `ArrayList`.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Adios"));
newArrayList.clear();
newArrayList.forEach(System.out::println);
```
> No imprime nada
</details>

<details>
<summary><h3>clone</h3></summary>

### clone()

Clona un `ArrayList`. Devuelve un `Object`, por lo que hay que hacer un Cast. Es mejor utilizar el constructor new ArrayList(Collection<? extends E> c).

#### Ejemplo 1

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Adios"));
ArrayList<String> otherArrayList = (ArrayList<String>) newArrayList.clone();
otherArrayList.forEach(System.out::println);
```
> Imprime: "Hola", "Qué tal", "Adios"

#### Ejemplo 2 (Utilizando el constructor)

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Adios"));
ArrayList<String> otherArrayList = new ArrayList<>(newArrayList);
otherArrayList.forEach(System.out::println);
```
> Imprime: "Hola", "Qué tal", "Adios"
</details>

<details>
<summary><h3>contains</h3></summary>

### contains(Object o)

Devuelve `true` si el `ArrayList` contiene el elemento especificado.
**Importante:** El método contains, utiliza el método equals del objeto pasado como argumento. Si no se ha hecho override del método equals, nos devolverá falso salvo que sean la misma instancia del mismo objeto.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Adios"));
System.out.println(newArrayList.contains("Hola"));
```
> Imprime: "true"
</details>
    
<details>
<summary><h3>ensureCapacity</h3></summary>

### ensureCapacity(int minCapacity)

Aumenta la capacidad del `ArrayList` para asegurarse de que puede almacenar como mínimo un número de elementos.
Además, mejora el rendimiento de la carga de muchos datos.

#### Ejemplo

```java
ArrayList<Integer> newArrayList = new ArrayList<>();
ArrayList<Integer> otherArrayList = new ArrayList<>();

long inicio = System.currentTimeMillis();
for (int i = 0; i < 157_483_647; i++) {
    newArrayList.add(i);
}
long fin = System.currentTimeMillis();
System.out.println("Primera carga: " + (fin - inicio));
newArrayList = null;

otherArrayList.ensureCapacity(157_483_647); //Utilizo ensureCapacity
long inicio2 = System.currentTimeMillis();
for (int i = 0; i < 157_483_647; i++) {
    otherArrayList.add(i);
}
long fin2 = System.currentTimeMillis();
System.out.println("Segunda carga: " + (fin2 - inicio2));
```
> Imprime: "Primera carga: 2623", "Segunda carga: 1241"
</details>
    
<details>
<summary><h3>equals</h3></summary>

### equals(Object o)
Compara el objeto especificado con esta lista.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Adios"));
System.out.println(newArrayList.equals(Arrays.asList("Hola", "Qué tal", "Adios")));
```
> Imprime: "true"
</details>
  
<details>
<summary><h3>forEach</h3></summary>

### forEach(Consumer<? super E> action)
Realiza la acción proporcionada como argumento a cada elemento del `ArrayList` hasta que todos los elementos han sido procesados.

#### Ejemplo

```java
ArrayList<Integer> newArrayList = new ArrayList<>(Arrays.asList(1, 2, 4, 5));
newArrayList.forEach(num -> System.out.println(num * 3));
```
> Imprime: 3, 6, 12, 15
</details>
  
<details>
<summary><h3>get</h3></summary>

### get(int index)
Devuelve el elemento del índice indicado.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Adios"));
System.out.println(newArrayList.get(1));
```
> Imprime: "Adios"
</details>
   
<details>
<summary><h3>hashCode</h3></summary>

### hashCode()
Devuelve el hash code del `ArrayList`.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Adios"));
System.out.println(newArrayList.hashCode());
```
> Imprime: 133020495
</details>
   
<details>
<summary><h3>indexOf</h3></summary>

### indexOf(Object o)
Devuelve el índice de la primera aparición del elemento especificado en el `ArrayList`. Si no se encuentra, devuelve -1.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Adios"));
System.out.println(newArrayList.indexOf("Adios"));
System.out.println(newArrayList.indexOf("Qué tal"));
```
> Imprime: 1, -1
</details>
   
<details>
<summary><h3>isEmpty</h3></summary>

### isEmpty()
Devuelve `true` si el `ArrayList` está vacío.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>();
System.out.println(newArrayList.isEmpty());
newArrayList.add("Hola");
System.out.println(newArrayList.isEmpty());
```
> Imprime: "true", "false"
</details>
   
<details>
<summary><h3>iterator</h3></summary>

### iterator()
Devuelve un `Iterator` de los elementos del `ArrayList`.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Adios"));
Iterator<?> iterator = newArrayList.iterator();
System.out.println(iterator.next());
System.out.println(iterator.next());
iterator.remove();
System.out.println("x".repeat(15));
newArrayList.forEach(System.out::println);
```
> Imprime: "Hola", "Qué tal", "xxxxxxxxxxxxxxx", "Hola", "Adios"
</details>
    
<details>
<summary><h3>lastIndexOf</h3></summary>

### lastIndexOf(Object o)
Devuelve el índice de la última aparición del elemento especificado en el `ArrayList`. Si no se encuentra, devuelve -1.

#### Ejemplo

```java
ArrayList<Integer> newArrayList = new ArrayList<>(Arrays.asList(1, 3, 4, 3));
System.out.println(newArrayList.lastIndexOf(4));
System.out.println(newArrayList.lastIndexOf(3));
System.out.println(newArrayList.lastIndexOf(5));
```
> Imprime: 2, 3, -1
</details>

<details>
<summary><h3>listIterator</h3></summary>
   
### listIterator()
Devuelve un `ListIterator` de los elementos del `ArrayList`.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Adios"));
ListIterator<?> iterator = newArrayList.listIterator();
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.next());
System.out.println(iterator.previous());
System.out.println(iterator.previous());
iterator.remove();
System.out.println("x".repeat(15));
newArrayList.forEach(System.out::println);
```
> Imprime: "Hola", "Qué tal", "Adios", "Adios", "Qué tal", "xxxxxxxxxxxxxxx", "Hola", "Adios"
</details>
    
<details>
<summary><h3>remove</h3></summary>
 
### remove(int index)
Elimina el elemento del índice especificado.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Adios"));
newArrayList.remove(1);
newArrayList.forEach(System.out::println);
```
> Imprime: "Hola", "Adios"

### remove(Object o)
Elimina la primera aparición del elemento en el `ArrayList`.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Adios"));
newArrayList.remove("Qué tal");
newArrayList.forEach(System.out::println);
```
> Imprime: "Hola", "Adios"
</details>

<details>
<summary><h3>removeAll</h3></summary>
              
### removeAll(Collection<?> c)
Elimina del `ArrayList` todos los elementos que contiene la colección pasada.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Muy buenas", "Adios"));
ArrayList<String> otherArrayList = new ArrayList<>(Arrays.asList("Hola", "Saludos", "Adios"));
newArrayList.removeAll(otherArrayList);
newArrayList.forEach(System.out::println);
```
> Imprime: "Qué tal", "Muy buenas"
</details>

<details>
<summary><h3>removeIf</h3></summary>

### removeIf(Predicate<? super E> filter)
Elimina del `ArrayList` todos los elementos que cumplan la condición del `Predicate`.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Muy buenas", "Adios"));
newArrayList.removeIf(texto -> texto.contains("o"));
newArrayList.forEach(System.out::println);
```
> Imprime: "Qué tal", "Muy buenas"
</details>
              
<details>
<summary><h3>removeRange</h3></summary>
 
### removeRange(int fromIndex, int toIndex)
Elimina todos los elementos cuyo índice sea desde `fromIndex` (incluído) y `toIndex` (excluído). El método es `protected`, por lo que para conseguir el mismo resultado hay que utilizar el método `subList(int fromIndex, int toIndex)` y utilizar el método `clear()`.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Muy buenas", "Adios"));
newArrayList.subList(1, 3).clear();
newArrayList.forEach(System.out::println);
```
> Imprime: "Qué tal", "Adios"
</details>

<details>
<summary><h3>retainAll</h3></summary>
              
### retainAll(Collection<?> c)
Mantiene en el `ArrayList` todos los elementos que contiene la colección pasada.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Muy buenas", "Adios"));
ArrayList<String> otherArrayList = new ArrayList<>(Arrays.asList("Hola", "Saludos", "Adios"));
newArrayList.retainAll(otherArrayList);
newArrayList.forEach(System.out::println);
```
> Imprime: "Hola", "Adios"
</details>
              
<details>
<summary><h3>set</h3></summary>

### set(int index, E element)
Remplaza el elemento del índice especificado por el elemento pasado como argumento.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Muy buenas", "Adios"));
newArrayList.set(1, "k tal");
newArrayList.forEach(System.out::println);
```
> Imprime: "Hola", "k tal", "Muy buenas", "Adios"
</details>

<details>
<summary><h3>size</h3></summary>
  
### size()
Devuelve el número de elementos.

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Muy buenas", "Adios"));
System.out.println(newArrayList.size());
```
> Imprime: 4

<details>
<summary><h3>spliterator</h3></summary>

### spliterator()
Crea un `Spliterator` con los elementos del `ArrayList`.

#### Ejemplo

```java
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 5, 6, 8));
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
</details>

<details>
<summary><h3>subList</h3></summary>

              
### subList(int fromIndex, int toIndex)
Devuelve una lista con los elementos del `ArrayList` desde `fromIndex` (incluído) y `toIndex` (excluído)

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Muy buenas", "Adios"));
newArrayList.subList(1, 3).forEach(System.out::println);
```
> Imprime: "Qué tal", "Muy buenas"
</details>

<details>
<summary><h3>toArray</h3></summary>
              
### toArray(T[] a)
Devuelve un `Array[]` con todos los elementos del `ArrayList`.

#### Ejemplo

```java
ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("Hola", "Qué tal", "Muy buenas", "Adios"));
String[] fixedArray = newArrayList.toArray(String[]::new);
System.out.println(fixedArray[1]);
```
> Imprime: "Qué tal"
</details>

<details>
<summary><h3>trimToSize</h3></summary>

### trimToSize()
Recorta la capacidad `ArrayList` a su tamaño actual (`size`)
</details>

</details>
              