# Set
Esta interface es la encargada de agrupar una colección de elementos que **no permite repetición**

Ver la interfaz [java.util.Set](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Set.html) para más información.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

## Métodos estáticos

### copyOf(Collection<? extends E> coll)

Crea una copia inmutable de la colección pasada como argumento.

#### Ejemplo

```java
Collection<?> set = Arrays.asList(1, 2, 2, 3, 3, 4);
Set<?> setCopiado = Set.copyOf(lista);
setCopiado.forEach(System.out::print);
```
> Imprime: 1234

### of( * )
Crea un `Set` inmutable del array

#### Ejemplo
```java
Set<?> mySet = Set.of(1, 2, 2, 3, 3, 4); // No compila
Set<?> myTrueSet = Set.of(1, 2, 3, 5, 9);
myTrueSet.forEach(System.out::print);
```
> Imprime: 12359
