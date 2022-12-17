# for

El bucle `for` junto con el bucle `for-each`, son estructuras lógicas que permiten realizar una y
otra vez una acción, siempre y cuando se cumpla una condición booleana

## Ejemplos for

### Simple

```java
for (int i = 0; i < 100; i++)
{
    // Hacer algo
}
```

### Con varios índices

```java
for (int i = 0, f = 6; i < 10 && f > 0; i++, f--) {
    System.out.print(i + " - " + f + ",  ");
}
```

> Imprime: 0 - 6, 1 - 5, 2 - 4, 3 - 3, 4 - 2, 5 - 1,

### Bucles anidados con break y etiquetas.

```java
primero: // Etiqueta
for (int i = 0; i < 5; i++) {
    segundo: // Etiqueta
    for (int j = 0; j < 5; j++) {
    if (i == 3)
        break primero; // interrumpe el bucle exterior.
    if (j == 2)
        break segundo; // interrumpe el bucle interior.
    System.out.print(i + " " + j + ", ");
    }
}
```

> Imprime: 0 0, 0 1, 1 0, 1 1, 2 0, 2 1,

## Ejemplo for-each

```java
int[] numbers = { 1, 2, 3 };
for (int number : numbers) {
    System.out.print(number + " ");
} 
```

> Imprime: 1 2 3 