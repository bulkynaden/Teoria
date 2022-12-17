# Lambda Expressions
Las expresiones lamda permiten simplificar el código en el manejo de las interfaces funcionales. Las interfaces funcionales son interfaces con un único método abstracto (es decir, que sólo nos obliga a implementar un método).

Las expresiones lambda son realmente funciones anónimas pero que pueden ser asignadas a una variable.

Ver [interfaces funcionales](/src/com/theory/types/functional_interfaces/) para más información.

## Sintaxis

```java
(parametros) -> { cuerpo };
```

### Simplificación

```java
(o1, o2) -> { return o1 + o2; };
```

Si la expresión lambda contiene un único parámetro, se pueden omitir los paréntesis:

```java
o -> { return o * 2; };
```

Si la expresión lambda no acepta parámetros, hay que incluir ();

```java
() -> { System.out.println("Prueba"); };
```

Si el cuerpo de la expresión lambda contiene una única instrucción, se pueden omitir los corchetes.

```java
o -> System.out.println(o);
```

De esta manera, utilizando la referencia a métodos estáticos, la expresión lambda se puede reducir aún más a:

```java
System.out::println;
```

## Ejemplo

### Ejemplo sin lambda

```java
Comparator<Integer> comparator = new Comparator<Integer>() {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
};
```
> `Comparator` es una interfaz funcional, que nos obliga a implementar su único método abstracto `compare`. Por lo tanto, podemos usar una expresión lambda para simplificar el código.

### Ejemplo con lambda

```java
Comparator<Integer> comparator = (o1, o2) -> {
    return o2 - o1;
};
```
> En este caso, al ser una interfaz funcional, Java sabe que nos estamos refiriendo a su único método abstracto `compare`, por lo que su implementación se puede reducir.

Como en este ejemplo, el cuerpo de la función únicamente contiene una única instrucción: `return o2 - o1;`, la expresión lamda se puede reducir aún más:

```java
Comparator<Integer> comparator = (o1, o2) -> o2 - o1;
```
> En este caso, Java sabe que `o2 - o1` es el valor devuelto por la el método `compare`, por lo que la expresión `return` se puede omitir.