# Functional interfaces
El conocimiento de las interfaces funcionales es de vital importancia, ya que permiten a los programadores usar la programación funcional con los conceptos de POO. Las interfaces funcionales permiten el uso de las expresiones lambda y las referencias a métodos.

## Definición
Una interfaz funcional es una interfaz con un único método abstracto considerado como una función. Estas interfaces permiten implementarlas usando una expresión lambda o una referencia a método.
Las interfaces funcionales, aparte de un único método abstracto, pueden tener los métodos `default` o `static` que se quiera.

### Ejemplo

```java
@FunctionalInterface // Esta anotación, aunque no es obligatoria, marca la interfaz como interfaz
                     // funcional, y lanza un error de compilación si no cumple los requisitos para
                     // que sea una interfaz funcional
interface MiInterfazFuncional<T, R> {
    R hazAlgo(T val); // Único método abstracto, que acepta un valor tipo T y devuelve un valor tipo R.
}
```

Como la interfaz `MiInterfazFuncional` sólo tiene un método abstracto `hazAlgo`, es una Interfaz Funcional válida que podemos usar de la siguiente manera:

```java
MiInterfazFuncional<Integer, Integer> multiplicaPor10 = n -> n * 10;
System.out.println(multiplier10.hazAlgo(5)); // 50
```

## Implementación de una interfaz funcional
Para implementar una Interfaz Funcioinal, primero hay que crear una clase anónima que implemente esa interfaz, posteriormente crear una instancia de esa clase que implemente el método abstracto de la Interfaz Funcional y le asigne un comportamiento en concreto.

### Implementación como clase anónima
Como cualquier otra interfaz, una Interfaz Funcional se puede implementar usando una clase anónima o una implementación normal.

```java
MiInterfazFuncional<Integer, Integer> elevarAlCuadrado = new MiInterfazFuncional<Integer, Integer>(){
    @Override
    public Integer hazAlgo(Integer val) {
        return val * val;
    }
};
int val = elevarAlCuadrado.hazAlgo(5);
System.out.println(val); // Imprime 25
```

### Implementación con expresión lambda
Implementación con una expresión lambda que es lo mismo que la implementación anterior.

```java
MiInterfazFuncional<Integer, Integer> elevarAlCuadrado = val -> val * val;
int val = elevarAlCuadrado.hazAlgo(5);
System.out.println(val); // Imprime 25
```
> Con el uso de expresiones lambda, se reduce mucho el código y se lee de forma más clara.

### Implementación con referencia a método
Suponiendo que tenemos una Clase con un método estático que realiza la operación que queremos realizar, como por ejemplo, elevar al cuadrado:

```java
class MisFunciones {
    public static int calcularCuadrado(int valor) {
        return valor * valor;
    }
}
```

Podemos utilizar la referencia a ese método

```java
MiInterfazFuncional<Integer, Integer> elevarAlCuadrado = val -> MisFunciones.calcularCuadrado(val);
int val = elevarAlCuadrado.hazAlgo(5);
System.out.println(val); // Imprime 25
```

Que simplificado resulta:

```java
MiInterfazFuncional<Integer, Integer> elevarAlCuadrado = MisFunciones::calcularCuadrado;
int val = elevarAlCuadrado.hazAlgo(5);
System.out.println(val); // Imprime 25
```

## Interfaces funcionales de Java

Ver el paquete [java.util.function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/package-summary.html) para más información.

### Consumer

### Supplier

### Predicate

### Function

### UnaryOperator

### Todas las interfaces funcionales

| Nombre | Método abstracto | Otros métodos | Descripción |
|---|---|---|---|
| BiConsumer<T,U> | `void` accept(`T` t, `U` u) | andThen | Representa un `void` que acepta dos parámetros |
| BiFunction<T,U,R> | `R` apply(`T` t, `U` u) | andThen | Representa una función que acepta dos parámetros y devuelve un resultado |
| BinaryOperator<T> | `R` apply(`T` t, `U` u) | maxBy, minBy | Representa una función que acepta dos parámetros del mismo tipo y devuele un resultado del mismo tipo | 
| BiPredicate<T,U> | `boolean` test(`T` t, `U` u) | and, negate, or | Representa una función que acepta dos parámetros y devuelve un `boolean` |
| BooleanSupplier | `boolean` getAsBoolean() |  | Representa un `Supplier` que devuelve un valor `boolean` |
| Consumer<T> | `void` accept(`T` t) | andThen | Representa un `void` que acepta un parámetro |
| DoubleBinaryOperator | `double` applyAsDouble(`double` left, `double` right) |  | Representa una función que acepta dos parámetros `double` y devuelve un `double` |
| DoubleConsumer | `void` accept(`double` value) | andThen | Representa un `void` que acepta un valor `double` |
| DoubleFunction<R> | `R` apply(`double` value) |  | Representa una función que acepta un valor `double` y devuelve un resultado |
| DoublePredicate | `boolean` test(`dobule` value) | and, negate, or | Representa una función que acepta un `double` y devuelve un `boolean` |
| DoubleSupplier | `double` getAsDouble() |  | Representa una función sin parámetros que devuelve un `double` |
| DoubleToIntFunction | `int` applyAsInt(`double` value) |  | Representa una función que acepta un `double` y devuelve un `int`|
| DoubleToLongFunction | `long` applyAsLong(`double` value) |  | Representa una función que acepta un `double` y devuelve un `long` |
| DoubleUnaryOperator | `double` applyAsDouble(`double` operand) | andThen, compose, identity |  Representa una función que acepta un `double` y devuelve un `double` |
| Function<T,R> | `R` apply(`T` t) | andThen, compose, identity | Representa una función que acepta un parámetro y devuelve un resultado |
| IntBinaryOperator | `int` applyAsInt(`int` left, `int` right) |  | Representa una función que acepta dos `int` y devuelve un `int` |
| IntConsumer | `void` accept(`int` value) | andThen | Representa un `void` que acepta un `int` |
| IntFunction<R> | `R` apply(`int` value) |  | Representa una función que acepta un valor `int` y devuelve un resultado |
| IntPredicate | `boolean` test(`int` value) | and, negate, or | Representa una función que acepta un `int` y devuelve un `boolean` |
| IntSupplier | `int` getAsInt() |  | Representa una función sin parámetros que devuelve un `int` |
| IntToDoubleFunction | `double` applyAsDouble(`int` value) |  | Representa una función que acepta un `int` y devuelve un `double` |
| IntToLongFunction | `long` applyAsLong(`int` value) |  | Representa una función que acepta un `int` y devuelve un `long` |
| IntUnaryOperator | `int` applyAsInt(`int` operand) | andThen, compose, identity | Representa una función que acepta un `int` y devuelve un `int` |
| LongBinaryOperator | `long` applyAsLong(`long` left, `long` right) |  | Representa una función que acepta dos `long` y devuelve un `long` |
| LongConsumer | `void` accept(`long` value) | andThen | Representa un `void` que acepta un `long` |
| LongFunction<R> | `R` apply(`long` value) |  | Representa una función que acepta un valor `long` y devuelve un resultado |
| LongPredicate | `boolean` test(`long` value) | and, negate, or | Representa una función que acepta un `long` y devuelve un `boolean` |
| LongSupplier | `long` getAsLong()) |  | Representa una función sin parámetros que devuelve un `long` |
| LongToDoubleFunction | `double` applyAsDouble(`long` value) |  | Representa una función que acepta un `long` y devuelve un `double` |
| LongToIntFunction | `int` applyAsInt(`long` value) |  | Representa una función que acepta un `long` y devuelve un `int` |
| LongUnaryOperator | `long` applyAsLong(`long` operand) | andThen, compose, identity | Representa una función que acepta un `long` y devuelve un `long` |
| ObjDoubleConsumer<T> | `void` accept(`T` t, `double` value) |  | Representa un `void` que acepta un `Object` y un `double` |
| ObjIntConsumer<T> | `void` accept(`T` t, `int` value) |  | Representa un `void` que acepta un `Object` y un `int` |
| ObjLongConsumer<T> | `void` accept(`T` t, `long` value) |  | Representa un `void` que acepta un `Object` y un `long` |
| Predicate<T> | `boolean` test(`T` t) | and, isEqual, negate, not, or | Representa una función que acepta un parámetro y devuelve un `boolean` |
| Supplier<T> | `T` get() |  | Representa una función sin parámetros que devuelve un resultado |
| ToDoubleBiFunction<T,U> | `double` applyAsDouble(`T` t, `U` u) |  | Representa una función que acepta dos parámetros y devuelve un `double` | 
| ToDoubleFunction<T> | `double` applyAsDouble(`T` value) |  | Representa una función que acepta un parámetro y devuelve un `double` |
| ToIntBiFunction<T,U> | `int` applyAsInt(`T` t, `U` u) |  | Representa una función que acepta dos parámetros y devuelve un `int` |
| ToIntFunction<T> | `int` applyAsInt(`T` value) |  | Representa una función que acepta un parámetro y devuelve un `int` |
| ToLongBiFunction<T,U> | `long` applyAsLong(`T` t, `U` u) |  | Representa una función que acepta dos parámetros y devuelve un `long` |
| ToLongFunction<T> | `long` applyAsLong(`T` value) |  | Representa una función que acepta un parámetro y devuelve un `long` |
| UnaryOperator<T> | `T` apply(`T` value) |  | Representa una función que acepta un parámetro y devuelve un resultado del mismo tipo |




