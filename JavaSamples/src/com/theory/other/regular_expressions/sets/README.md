# Conjuntos y rangos

El carácter punto nos permite escribir patrones comunes para coincidir. El punto, sin embargo, coincide casi con todos los caracteres posibles, y a veces queremos ser más específicos en nuestro regex. Entonces, los conjuntos vienen en nuestra ayuda.

## El conjunto de caracteres
Cada conjunto corresponde a un solo carácter en la cadena, pero qué carácter exactamente puede ser se define por el contenido del conjunto. El conjunto se escribe entre corchetes, `[]`. Por ejemplo, el conjunto `[abc]` significa que un solo carácter "a", "b" o "c" puede coincidir con él.

```java
String pattern = "[bcr]at"; // coincide con las cadenas "bat", "cat", "rat", pero no "fat"

"rat".matches(pattern); // true
"fat".matches(pattern); // false
```

Se pueden usar varios conjuntos a la vez.

```java
String pattern = "[ab]x[12]"; // puede coincidir con a o b seguido de x seguido por 1 o 2
```

## El rango de carácteres
A veces queremos hacer nuestros conjuntos de caracteres bastante grandes. En este caso, no tenemos que escribirlos todos: podemos especificar un rango designado por el símbolo guión `-` en su lugar. El carácter que precede el guión denota el punto de partida del rango, el carácter que lo sigue es el último carácter que cae dentro del rango. Si los caracteres necesarios siguen unos a otros de inmediato en la tabla de codificación `ASCII/Unicode`, podemos ponerlos en un conjunto como rango de caracteres. Esto incluye las letras ordenadas alfabéticamente y los valores numéricos. Por ejemplo, podemos escribir un conjunto que coincida con cualquier dígito:

```java
String anyDigitPattern = "[0-9]"; // coincide con cualquier dígito de 0 a 9
```

Lo mismo se aplica a los rangos de letras como `[a-z]` o `[A-Z]`. Estos rangos coinciden con todas las letras minúsculas y mayúsculas latinas respectivamente. Dado que los patrones son sensibles a mayúsculas y minúsculas, si queremos coincidir con cualquier letra, podemos escribir la siguiente expresión regular:

```java
String anyLetterPattern = "[a-zA-Z]"; // coincide con cualquier letra "a", "b", ..., "A", "B", ...
```

```java
String anyLetterPattern = "[a-z!?.A-Z]"; // coincide con cualquier letra y "!", "?", "."
```

## Excluyendo caracteres
En algunos casos, es fácil definir qué caracteres no se quieren. En ese caso, podemos escribir un conjunto que coincida con todo excepto con los caracteres mencionados en él. Para eso, escribimos el carácter sombrero `^` como el primero en el conjunto.

```java
String regex = "[^abc]"; // coincide con todo excepto con "a", "b", "c"

"a".matches(regex); // false
"b".matches(regex); // false
"c".matches(regex); // false
"d".matches(regex); // true
```

Lo mismo funciona para los rangos:

```java
String regex = "[^1-6]";

"1".matches(regex); // false
"2".matches(regex); // false
"0".matches(regex); // true
"9".matches(regex); // true
```


## Escapando caracteres en conjuntos
La regla general es que no necesita escapar caracteres especiales dentro de conjuntos si se usan en su significado literal. Por ejemplo, el conjunto `[.?!]` coincidirá con un solo punto, un signo de interrogación, un signo de exclamación, y nada más. Sin embargo, los caracteres que forman un conjunto o un rango deben ser escapeados o colocados en una posición neutral en caso de buscar sus símbolos literales.

- Para coincidir con el carácter guión en sí mismo, debemos colocarlo en la primera o en la última posición en el conjunto: "[-a-z]" coincide con las letras minúsculas y el guión, y "[A-Z-]" coincide con las letras mayúsculas y el guión. 
- Para escapar el símbolo de la negación `^`, debemos colocarlo en una posición diferente a la primera en el conjunto:

