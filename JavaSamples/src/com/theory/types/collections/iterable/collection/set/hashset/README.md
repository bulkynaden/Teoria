# HashSet
La clase `HashSet` representa un set como una tabla de hash. Utiliza los hash code de los elementos para almacenarlos. No garantiza ningún orden de los elementos ni que sea constante en el tiempo.

Ver la clase [java.util.HashSet](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashSet.html) para más información.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

## Métodos de instancia

### add(E e)

Añade un elemento al set si no existe ya.

#### Ejemplo

```java
Set<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 4));
mySet.add(1);
mySet.add(5);
mySet.forEach(System.out::print);
```
> Imprime: 12345

### clear()

Elimina todos los elementos de este `HashSet`.

#### Ejemplo

```java
Set<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 4));
mySet.clear();
mySet.forEach(System.out::print);
```
> No imprime nada

### clone()

Devuelve una copia de este `HashSet`.

#### Ejemplo

```java
HashSet<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 4));
Set<Integer> myOtherSet = new HashSet<>();
myOtherSet = (Set<Integer>) mySet.clone();
mySet.clear();
mySet.forEach(System.out::print);
myOtherSet.forEach(System.out::print);
```
> No imprime nada

### contains(Object o)

Devuelve `true` si este set contiene el elemento especificado.

#### Ejemplo

```java
HashSet<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 4));
System.out.println(mySet.contains(1));
System.out.println(mySet.contains(10));
```
> Imprime: `true`, `false`

### isEmpty()

Devuelve `true` si este set no contiene ninguún elemento.

#### Ejemplo

```java
HashSet<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 4));
System.out.println(mySet.isEmpty());
mySet.clear();
System.out.println(mySet.isEmpty());
```
> Imprime: `false`, `true`

### remove(Object o)

Elimina el elemento especificado de este set si está presente.

#### Ejemplo

```java
HashSet<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 4));
mySet.remove(2);
mySet.forEach(System.out::print);
```
> Imprime: 134

### size()

Devuelve el número de elementos de este set.

#### Ejemplo

```java
HashSet<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 4));
System.out.print(mySet.size());
```
> Imprime: 4

### toArray()

Devuelve un array `Object[]` con todos los elementos de este set.

#### Ejemplo

```java
HashSet<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 4));
var myArray = mySet.toArray();
System.out.print(myArray[1]);
```
> Imprime: 2

### toArray(T[] a)

Devuelve un array del tipo especificado como argumento con todos los elementos de este set.

#### Ejemplo

```java
HashSet<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 4));
Integer[] myArray = new Integer[mySet.size()];
myArray = mySet.toArray(myArray);
System.out.print(myArray[1]);
```
> Imprime: 2
