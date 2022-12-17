# Caracteres cuantificadores en expresiones regulares

Hay un tipo de caracteres llamados cuantificadores, que define cuántas veces puede ocurrir otro carácter en un patrón regex. Un cuantificador se puede escribir después de un carácter regular, así como después de uno especial. En general, los cuantificadores son una de las características más esenciales e importantes del lenguaje regex, ya que permiten que un único patrón coincida con cadenas diferentes de diferentes longitudes.

## Lista de cuantificadores

Aquí está una lista de cuantificadores para recordar:

- `+` coincide con una o más repeticiones del carácter precedente
- `*` coincide con cero o más repeticiones del carácter precedente
- `{n}` coincide exactamente con n repeticiones del carácter precedente
- `{n,m}` coincide con al menos n pero no más de m repeticiones del carácter precedente
- `{n,}` coincide con al menos n repeticiones del carácter precedente
- `{0,m}` coincide con no más de m repeticiones del carácter precedente
- `?` que hace que el carácter precedente sea opcional. Es una abreviatura de `{0,1}`.

## Cuantificador `+`

Aquí se demuestra el carácter `+`, que coincide con una o más repeticiones del carácter precedente:

```java
String regex = "ca+b";

"cab".matches(regex); // true
"caaaaab".matches(regex); // true
"cb".matches(regex); // false porque no tiene al menos una repetición de 'a'
```

> Sólo coincide con las cadenas que tienen una o más repeticiones del carácter 'a'.

## Cuantificador `*`

El siguiente ejemplo demuestra el carácter `*`, que coincide con cero o más repeticiones del carácter precedente:

```java
String regex = "A[0-3]*";

"A".matches(regex);  // true porque el patrón coincide con cero o más repeticiones
"A0".matches(regex); // true
"A000111222333".matches(regex); // true
```

El cuantificador `*`, a diferencia del cuantificador `+`, permite que el patrón coincida también con las cadenas que no tienen el carácter "cuantificado" en absoluto.

En el ejemplo siguiente, hay un patrón que describe la cadena "John" ubicada entre un número indefinido de caracteres indefinidos en el texto:

```java
String johnRegex = ".*John.*"; // coincide con todas las cadenas que contienen la subcadena "John"

String textWithJohn = "My friend John is a computer programmer";

textWithJohn.matches(johnRegex); // true

String john = "John";

john.matches(johnRegex); // true

String textWithoutJohn = "My friend is a computer programmer";

textWithoutJohn.matches(johnRegex); // false
```

Entonces, el cuantificador `*` se puede usar para comprobar si una subcadena de una cadena coincide con un patrón. Al usarlo, podemos omitir espacios u otros caracteres que no deseamos predecir en nuestro patrón.

## Número de repeticiones
Ambos cuantificadores anteriores tienen un amplio rango de aplicaciones, pero no permiten especificar cuántas veces se puede repetir un carácter. Afortunadamente, hay un grupo de cuantificadores que permiten especificar el número de repeticiones en llaves: `{n}`, `{n,m}`, `{n,}`.

**Una aclaración importante**: no se deben usar espacios en las llaves. Puede haber solo uno o dos números y, opcionalmente, una coma. Poner espacios dentro de las llaves lleva a la "desactivación" del cuantificador y, como resultado, una expresión regular totalmente diferente. Por ejemplo, "a{1, 2}" solo coincidirá con la cadena exacta "a{1, 2}", no con "a" o "aa".

```java
String regex = "[0-9]{4}"; // cuatro dígitos

"6342".matches(regex);  // true
"9034".matches(regex);  // true

"182".matches(regex);   // false
"54312".matches(regex); // false
```

Coincidir desde `n` hasta `m` repeticiones es posible gracias al cuantificador `{n,m}`. El rango especificado en las llaves comienza y termina de forma inclusiva: `m` repeticiones encontradas también cuentan como una coincidencia. Esto es estándar para el lenguaje de expresiones regulares independientemente de la implementación, aunque puede sonar un poco contraintuitivo para los usuarios de Java, ya que los rangos de Java terminan exclusivamente.

```java
String regex = "1{2,3}";

"1".matches(regex);    // false
"11".matches(regex);   // true
"111".matches(regex);  // true
"1111".matches(regex); // false
```

El último ejemplo demuestra cómo coincidir con al menos n repeticiones usando el cuantificador `{n,}`:

```java
String regex = "ab{4,}";

"abb".matches(regex); // false, no hay suficiente 'b'
"abbbb".matches(regex); // true
"abbbbbbb".matches(regex); // true
```