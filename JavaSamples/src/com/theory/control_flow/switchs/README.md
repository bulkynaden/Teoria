# switch

Usado para evaluar posibles casos de una variable

## Ejemplo 1

```java
int intToCompare;
switch (intToCompare) {
    case 1:
        // Hacer algo
        break;
    case 2:
        // Hacer algo
        break;
    case 3:
        // Hacer algo
        break;
    default:
        // Hacer algo
        break;
}
```

## Ejemplo 2

```java
String textFinalValue;
String textToCompare = "hola";
switch (textToCompare) {
    case "hola", "adios" -> textFinalValue = textToCompare;
    default -> textFinalValue = "no es válido";
}
```
