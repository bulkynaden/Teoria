# Map
Un `Map` es una colección de pares `key-value` o `clave-valor`. Las claves son únicas aunque los valores pueden repetirse.

Ver la interfaz [java.lang.Map](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html) para más información.

## Jerarquía

![Collection Framework Hierarchy in Java](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

## Métodos estáticos

### copyOf(Map<? extends K,? extends V> map)

Devuelve un `Map` **inmodificable** conteniendo las entradas del mapa especificado.

#### Ejemplo

```java
Map<Integer, String> mapa = Map.of(1, "Hola", 2, "Adios");
Map<?, ?> newMap = Map.copyOf(mapa);
System.out.println(newMap.values());
```
> Imprime "[Hola, Adios]"

### entry(K k, V v)

Devuelve un `Map.Entry` **inmodificable** con la clave y valor especificadas.

#### Ejemplo

```java
Entry<Integer, String> mapEntry = Map.entry(1, "Hola");
System.out.println(mapEntry);
```
> Imprime "1=Hola"

### of(K k1, V v1, ...)

Devuelve un `Map` **inmodificable** con la claves y valores especificados.

#### Ejemplo

```java
Map<Integer, String> mapa = Map.of(1, "Hola", 2, "Qué tal", 3, "Adios");
System.out.println(mapa);
```
> Imprime "{2=Qué tal, 3=Adios, 1=Hola}"

### ofEntries(Map.Entry<? extends K,? extends V>... entries)

Devuelve un `Map` **inmodificable** con las `Map.Entry` especificadas

#### Ejemplo

```java
Map.Entry<Integer, String> entry1 = new AbstractMap.SimpleEntry<>(1, "Hola");
Map.Entry<Integer, String> entry2 = new AbstractMap.SimpleEntry<>(2, "Adios");
Map<Integer, String> mapa = Map.ofEntries(entry1, entry2);
System.out.println(mapa);
```
> Imprime "{1=Hola, 2=Adios}"

## Métodos de instancia (default)

### compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)

Modifica el valor de una clave según la `BiFunction` especificada.

#### Ejemplo

```java
Map<String, Double> mapaSueldos = new HashMap<>();
mapaSueldos.put("Pepe", 1000.50);
mapaSueldos.put("Juan", 1450.90);
mapaSueldos.compute("Pepe", (k, v) -> v += 100.50d);
System.out.println(mapaSueldos);
```
> Imprime: "{Juan=1450.9, Pepe=1101.0}"

### computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)

Añade el valor de una clave según la `Function` especificada si la clave no está asociada a ningún valor o a un `null`.

#### Ejemplo

```java
Map<String, Double> mapaSueldos = new HashMap<>();
mapaSueldos.put("Pepe", 1000.50);
mapaSueldos.put("Juan", 1450.90);
mapaSueldos.computeIfAbsent("Pedro", v -> 100.50d);
mapaSueldos.computeIfAbsent("Juan", v -> 30000.50d);
System.out.println(mapaSueldos);
```
> Imprime: "{Pedro=100.5, Juan=1450.9, Pepe=1000.5}"

### computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)

Modifica el valor de una clave según la `BiFunction` especificada si la clave está asociada a un valor.

#### Ejemplo

```java
Map<String, Double> mapaSueldos = new HashMap<>();
mapaSueldos.put("Pepe", 1000.50);
mapaSueldos.put("Juan", 1450.90);
mapaSueldos.computeIfPresent("Pedro", (k, v) -> v += 100.50d);
mapaSueldos.computeIfPresent("Juan", (k, v) -> v += 30000.50d);
System.out.println(mapaSueldos);
```
> Imprime: "{Juan=31451.4, Pepe=1000.5}"

### forEach(BiConsumer<? super K,? super V> action)

Realiza la acción especificada por cada entrada en el `Map`.

#### Ejemplo

```java
Map<String, Double> mapaSueldos = Map.of("Juan", 12.2, "Pedro", 45.2);
mapaSueldos.forEach((k, v) -> System.out.println(k + " cobra " + v + "€."));
```
> Imprime: "Pedro cobra 45.2€.", "Juan cobra 12.2€."

### getOrDefault(Object key, V defaultValue)

Devuelve el valor de la clave especificada o el `defaultValue` si la clave no está asociada a ningún valor.

#### Ejemplo

```java
Map<String, Double> mapaSueldos = Map.of("Juan", 12.2, "Pedro", 45.2);
System.out.println(mapaSueldos.getOrDefault("Juan", 100d));
System.out.println(mapaSueldos.getOrDefault("Paco", 100d));
```
> Imprime: "12.2", "100.0"
