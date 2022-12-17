# String

## format

### Ejemplo

```java
System.out.printf("Me llamo %s. Nací el año %d.", "Javi", 1998);
```

%s = String
%d = Número entero
%f = Decimal
%.2f = Decimal con dos decimales

```java
String texto = String.format("Me llamo %s. Nací el año %d. Mido %.2f", "Javi", 1998, 1.903231);
System.out.print(texto);
```
> Imprime "Me llamo Javi. Nací el año 1998. Mido 1.90"

Alineado con 2 decimales, coma en los decimales y salto de línea

```java
String.format(new Locale("es","ES"),"%1$,-10.2f%n",(double)3545.211); // 3.545,21
```
  
