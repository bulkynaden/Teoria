# Method References
El uso de referencias a métodos permite un código más claro que el uso de expresiones lambda.

## Sintaxis

```java
objeto::nombreDelMetodo
```

### Ejemplo con lambda

```java
BiFunction<Integer, Integer, Integer> max = (e1, e2) -> Integer.max(e1, e2);
```

### Ejemplo con referencia a método

```java
BiFunction<Integer, Integer, Integer> max = Integer::max;
```

### Uso
Una vez definida la función `max` que devolverá el mayor de dos números, se puede usar en el momento que se vea oportuno.

```java
System.out.println(max.apply(50, 70)); // 70
```

## Tipos de métodos referenciados

Es posible utilizar métodos referenciados tanto para métodos estáticos como métodos se instancia.

- Referencia a métodos estáticos
- Referencia a métodos de instancia de un objeto existente.
- Referencia a métodos de instancia de un objeto de un tipo específico.
- Referencia a un constructor.

### Métodos estáticos

#### Expresión

```java
NombreClase::nombreMetodoEstatico
```

#### Ejemplo

```java
Function<Double, Double> sqrt = Math::sqrt; // Método estático "sqrt" de la clase Math
sqrt.apply(100d); // El resultado es 10.0d
```
> "Math::sqrt" es lo mismo que la expresión lambda "x -> Math.sqrt(x)".

### Métodos de instancia de un objeto.

#### Expresión

```java
nombreObjeto::nombreMetodoDeInstancia
```

#### Ejemplo

```java
String texto = "buenos días dim45.";
Supplier<String> ponmeEnMayusculas = texto::toUpperCase;
System.out.println(ponmeEnMayusculas.get());
System.out.println(texto);
```
> Imprime "BUENOS DÍAS DIM45.", "buenos días dim45."

### Métodos de instancia de un objeto de una clase específica.

#### Expresión

```java
NombreClase::nombreMetodoDeInstancia
```

#### Ejemplo

```java
String texto = "buenos días dim45.";
Function<String, String> ponmeEnMayusculas = String::toUpperCase;
String textoEnMayusculas = ponmeEnMayusculas.apply(texto);
System.out.println(textoEnMayusculas);
```
> Imprime "BUENOS DÍAS DIM45."

### Constructor

#### Expresión

```java
NombreClase::new
```

#### Ejemplo

Suponiendo que tenemos la clase `Person`

```java
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
```

Podemos crear objetos de la clase `Person` utilizando la referencia al constructor de la siguiente manera:

```java
Function<String, Person> generadorDePersonas = Person::new;
Person unaPersona = generadorDePersonas.apply("Pepe");
System.out.println(unaPersona.name);
```
> Imprime "Pepe"