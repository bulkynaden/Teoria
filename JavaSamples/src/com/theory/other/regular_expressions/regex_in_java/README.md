# Expresiones regulares en Java

En Java, una expresión regular es una secuencia de caracteres que especifica un conjunto de cadenas y que se utiliza para buscar, editar y manipular texto. Al igual que la mayoría de los lenguajes de programación, Java admite expresiones regulares.

Podemos crear una expresión regular mediante una cadena de texto. 

```java
String aleRegex = "ale"; // la expresión regular "ale"
```

En Java, el tipo de datos `String` tiene soporte incorporado para expresiones regulares. Las cadenas tienen un método especial llamado `matches` que toma un patrón de expresión regular como argumento y verifica si la cadena coincide con ese patrón. Tenga en cuenta que el método solo devuelve `true` cuando toda la cadena coincide con la expresión regular, de lo contrario, devuelve `false`. El patrón definido por la expresión regular se aplica al texto de izquierda a derecha.

En el ejemplo siguiente, intentamos comparar `aleRegex` con diferentes cadenas:

```java
"ale".matches(aleRegex); // true
"pale".matches(aleRegex); // false, la cadena "pale" tiene un carácter adicional
"ALE".matches(aleRegex); // false, las letras mayúsculas no coinciden con las minúsculas y viceversa
```

Como se puede ver, la cadena "pale" no coincide con nuestro patrón de expresión regular. La razón es que la implementación de regex de Java verifica si toda la cadena puede ajustarse al patrón de expresión regular, no solo alguna subcadena. En este sentido, Java se diferencia de muchos otros lenguajes de programación.

Aquí hay otro ejemplo. El patrón `helloRegex` tiene dos palabras separadas por una coma y un carácter de espacio en blanco:

```java
String helloRegex = "Hello, World";

"Hello, World".matches(helloRegex); // true
"Hello, world".matches(helloRegex); // false
"Hello,World".matches(helloRegex); // false
```

Como se ve en los ejemplos anteriores, cuando nuestro regex es simplemente una secuencia de caracteres simples, solo se puede emparejar con la cadena exacta. Sin embargo, hay formas más fáciles de comparar cadenas y no necesitaríamos expresiones regulares si eso fuera todo lo que podrían hacer.

El verdadero poder de las expresiones regulares radica en los caracteres especiales que ayudan a definir un patrón que coincida con varias cadenas diferentes a la vez.

## El punto y el signo de interrogación
El punto `.` coincide con cualquier carácter individual, incluyendo letras, dígitos, espacios y así sucesivamente. El único carácter con el que no puede coincidir es el carácter de nueva línea `\n`.

```java
String learnRegex = "Learn.Regex";

"Learn Regex".matches(learnRegex); // true
"Learn.Regex".matches(learnRegex); // true
"LearnRegex".matches(learnRegex); // false
"Learn, Regex".matches(learnRegex); // false
"Learn\nRegex".matches(learnRegex); // false
```

Como recuerdas, el signo de interrogación `?` es un carácter especial que significa "el carácter anterior o nada". Las palabras con una ortografía ligeramente diferente en inglés americano y británico sirven como un ejemplo tradicional de la aplicación de este carácter:

```java
String pattern = "behaviou?r";

"behaviour".matches(pattern); // true
"behavior".matches(pattern);  // true
```

La combinación `.?` básicamente significa "puede haber cualquier carácter individual o ningún carácter". En el ejemplo siguiente, el `regex` coincide con cualquier dos o un carácter:

```java
String pattern = "..?";

"I".matches(pattern);  // true
"am".matches(pattern); // true
"".matches(pattern);   // false
```

## El carácter de escape
Si queremos usar el punto `.` o el signo de interrogación `?` como un signo de puntuación regular y no como un símbolo especial dentro del patrón regex debemos proteger nuestro símbolo especial poniendo la barra invertida `\` antes de él. La barra invertida se llama carácter de escape porque ayuda a los símbolos a "escapar" de sus funciones. Una doble barra invertida `\\` en su regex significa una barra invertida única en la cadena de coincidencia.

Sin embargo, se complica más cuando implementa tales patrones en su programa Java. La barra invertida `\` funciona como un carácter de escape no solo para las expresiones regulares sino también para las cadenas de texto. Por lo tanto, en realidad, tenemos que usar una barra invertida adicional para escapar la que necesitamos en la expresión regular, como este:

```java
String endRegex = "The End\\.";

"The End.".matches(endRegex); // true
"The End?".matches(endRegex); // false
```

Por ejemplo, la expresión regular para cualquier secuencia de cinco caracteres que termina con un punto se ve así:

```java
String pattern = ".....\\.";

"a1b2c.".matches(pattern); // true
"Wrong.".matches(pattern); // true
"Hello!".matches(pattern); // false
```

## Conclusión
Las expresiones regulares son una herramienta poderosa para procesar cadenas en Java. Nos permiten definir patrones comunes utilizando caracteres regulares y caracteres con un significado especial, y luego verificar si las cadenas coinciden con estos patrones. Los puntos clave de esta lección son:

- El método de cadena `matches` se utiliza para comparar un patrón `regex` con una cadena.
- Devuelve `true` solo cuando la cadena completa coincide con el regexp.

