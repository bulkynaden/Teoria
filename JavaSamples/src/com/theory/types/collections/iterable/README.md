# Iterable
Al implementar esta interfaz, permite a un objeto ser recorrido con forEach().

Ver la interfaz [java.lang.Iterable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Iterable.html) para más información.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

## Ejemplo
```java
Iterable<?> list = Arrays.asList("Hola", "Adios");
list.forEach(System.out::print);
```
> Imprime "HolaAdios"
