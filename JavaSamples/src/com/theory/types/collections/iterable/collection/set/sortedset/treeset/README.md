# TreeSet
La clase `TreeSet` representa un set que nos garantiza el orden de los elementos. El orden de los elementos será el orden natural de los elementos o por la implementación del `Comparator` específico.

Ver la clase [java.util.TreeSet](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/TreeSet.html) para más información.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

## Constructores
### TreeSet()
Crea un `TreeSet` vacío, ordenado acorde al orden natural.

### TreeSet(Collection<? extends E> c)
Crea un `TreeSet` con los elementos de la colección especificada, ordenado por el orden natural de sus elementos.

### TreeSet(Comparator<? super E> comparator)
Crea un `TreeSet` vacío, ordenado acorde al `Comparator` especificado.

### TreeSet(SortedSet<E> s)
Crea un `TreeSet` con los elementos del `SortedSet` y usando su misma ordenación.

## Métodos de instancia

### add(E e)

Añade un elemento al `TreeSet` si no existe ya.

#### Ejemplo

```java
TreeSet<Integer> myTreeSet = new TreeSet<>(Arrays.asList(4, 4, 1, 5));
myTreeSet.add(1);
myTreeSet.add(2);
myTreeSet.forEach(System.out::print);
```
> Imprime: 1245

### addAll(Collection<? extends E> c)

Añade todos los elementos de la colección especificada a este `TreeSet`.

#### Ejemplo

```java
TreeSet<Integer> myTreeSet = new TreeSet<>(Arrays.asList(4, 4, 1, 5));
TreeSet<Integer> myNewTreeSet = new TreeSet<>((e1, e2) -> e2 - e1); // Hago que este nuevo TreeSet sea por orden
                                                                    // descendiente.
myNewTreeSet.addAll(myTreeSet);
myNewTreeSet.forEach(System.out::print);
```
> Imprime: 541

### ceiling(E e)

Devuelve el elemento del `TreeSet` que sea igual o el inmediatamente superior al elemento especificado. Devuelve null si no hay.

#### Ejemplo

```java
TreeSet<Integer> myTreeSet = new TreeSet<>(Arrays.asList(4, 4, 1, 5));
System.out.println(myTreeSet.ceiling(2));
```
> Imprime: 4