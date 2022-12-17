# Rexpresiones regulares

Manipular datos de texto es una tarea bastante popular tanto en programación como en la vida real. Por ejemplo, a menudo podemos necesitar analizar un texto, encontrar todas las cadenas específicas en un archivo, etc. Procesar datos de texto puede ser un problema bastante desafiante. Es por eso que existe una herramienta especial llamada expresiones regulares que lo hace más fácil y más rápido.

## ¿Por qué expresiones regulares?

Una expresión regular (regex o regexp para abreviar) es una secuencia de caracteres que describe un patrón común para un conjunto de cadenas. Dichos patrones se pueden utilizar para buscar, editar y manipular textos. Pueden verificar si una cadena completa o una subcadena coincide con el patrón dado o reemplazar la subcadena por otra.

## ¿Cuándo necesitamos esos patrones?

Las expresiones regulares son útiles cuando queremos:

* Obtener todos los archivos con la misma extensión (por ejemplo, `*.pdf`)
* Extraer todas las entradas de un nombre particular en diferentes formas (por ejemplo, `Edgar Poe`, `Edgar Allan Poe`, `E. A. Poe`, etc.)
* Encontrar todas las direcciones de correo electrónico
* Encontrar todas las estructuras numéricas que denotan fechas (por ejemplo, `02/03/2020`)

## Sintaxis de las expresiones regulares

Las expresiones regulares pueden considerarse como una especie de sublenguaje que la mayoría de los lenguajes de programación admiten, pero hay algunas diferencias en la sintaxis llamadas "sabores". En este tema, consideraremos las expresiones regulares aisladas de los lenguajes de programación para entender la idea general.

## Coincidencia en ejemplos: más PARK

Empecemos explorando cómo funciona la coincidencia formalmente. Aunque un patrón de expresión regular puede ser una expresión bastante complicada que contiene caracteres con un significado especial, la expresión regular más simple es simplemente una cadena de caracteres simples. Suponga que hay un conjunto de palabras: `PARK`, `SPARK`, `PARKING`, `MARK`, `QUARKS`. Necesita verificar cuáles de ellas contienen la palabra PARK. Esto es lo que sucede, por ejemplo, cuando realiza una búsqueda `Ctrl + F` en una página web.

Podemos resolver fácilmente este problema usando el patrón `PARK`. El patrón significa que los símbolos `P`, `A`, `R`, `K` en una palabra deben seguirse el uno al otro desde el extremo izquierdo hasta el derecho en una palabra. Suponemos que la palabra completa coincide con el patrón si cualquier parte (subcadena) de la palabra coincide con él.

Aquí hay algunas explicaciones:

- La palabra PARK coincide exactamente con nuestro patrón.
- La palabra SPARK coincide con nuestro patrón porque tiene una subcadena adecuada.
- La palabra PARKING coincide con nuestro patrón debido a la misma razón.
- La palabra MARK no coincide con nuestro patrón debido a la letra M.
- La palabra QUARKS no coincide con nuestro patrón ya que no tiene una parte adecuada.
- En resumen, solo tres palabras coinciden con el patrón PARK.

En las expresiones regulares, el caso de los caracteres es relevante: park no es lo mismo que PARK, es decir, no coinciden.
Además, consideremos otra secuencia de caracteres PAKR. No coincide con nuestro patrón ya que los dos caracteres están en el orden incorrecto.

## El poder de las expresiones regulares

Encontrar subcadenas no es muy impresionante, sin embargo. El verdadero poder de las expresiones regulares se manifiesta cuando comienzas a usar metacaracteres especiales llamados comodines. Te permiten definir un patrón, por lo que puedes coincidir con cadenas que no necesariamente contienen una secuencia de caracteres idéntica. Puedes saltarte algunos caracteres en una cadena o coincidir con diferentes caracteres en las mismas posiciones, o incluso repetir un carácter varias veces.

Presentemos los dops comodines más simles: el punto y el signo de interrogación.

### El carácter de punto

El carácter de punto . coincide con cualquier carácter individual, incluyendo letras, dígitos, etc., excepto el carácter de nueva línea, a menos que se especifique de otra manera.

Veamos nuestro ejemplo anterior de nuevo con varias palabras adicionales.

En el ejemplo anterior, dos palabras no coincidieron con el patrón debido a un carácter inadecuado: MARK y QUARKS. Pero si usamos el punto como comodín en lugar de una letra específica, ambas palabras coincidirán con el patrón:

* La palabra MARK coincide con el patrón `.ARK`
* La palabra QUARKS coincide con el patrón `QU.RKS`

El punto actúa como un comodín que coincide con cualquier carácter excepto el carácter de nueva línea.

### El signo de interrogación

El signo de interrogación ? indica que el carácter anterior puede o no estar presente en la cadena que se está buscando. En otras palabras, el carácter anterior es opcional.

Si queremos buscar la palabra PARK, pero también queremos permitir que aparezca una letra adicional después de la K, podemos usar el signo de interrogación para hacer que la K sea opcional:

* La palabra PARK coincide con el patrón `PARK?`
* La palabra PARKING coincide con el patrón `PARK?`

El signo de interrogación permite que el carácter K aparezca o no en la cadena que estamos buscando.

## Resumen

En resumen, las expresiones regulares son una herramienta poderosa para manipular y analizar datos de texto. Con la ayuda de comodines y otros caracteres especiales, se pueden crear patrones complejos que permiten buscar, editar y manipular cadenas de texto de manera rápida y precisa.