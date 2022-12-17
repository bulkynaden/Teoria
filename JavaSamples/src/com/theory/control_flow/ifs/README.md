# if

Se evalúa una condición y en caso de que se cumpla se ejecuta el contenido.

## Ejemplo

```java
if (condicion1) {
    if (condicion2) {
        // Hacer algo
    } else {
        // Hacer algo
    }
} else if (condicion3) {
    if (condicion4) {
        // Hacer algo
    }
} else {
    // Hacer algo
}
```

## Ternarios ? :

Usados para abreviar una instrucción `if`.

### Ejemplo 1

#### Con ternario

```java
String queHacer = (temperatura > 25) ? "A la playa!!!" : "Esperando al buen tiempo...";
```

#### Sin ternario

```java
String queHacer;
if (temperatura > 25) {
    queHacer = "A la playa!!!";
} else {
    queHacer = ""Esperando al buen tiempo...";
}
```

### Ejemplo 2

```java
double numero = (temperatura > 10) ? (Math.random() * 10) : 0;
```

### Ejemplo 3

```java
Comida miComida = cansado 
    ? pedirComida("china") 
    : hacerComida(); 
```