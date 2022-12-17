# Abreviaturas

Hay algunos conjuntos que se usan más que otros: conjuntos para dígitos, o caracteres alfanuméricos, o caracteres de espacio en blanco (hay bastantes caracteres de espacio en blanco, debemos decir). Para facilitar el uso de estos conjuntos, hay abreviaturas especiales que son equivalentes a ciertos conjuntos, pero tienen nombres más cortos.

## La lista de abreviaturas
Hay varias abreviaturas predefinidas para los conjuntos de caracteres comúnmente usados:

- `\d` es cualquier dígito, abreviatura de `[0-9]`;
- `\s` es un carácter de espacio en blanco (incluyendo tabulación y nueva línea), abreviatura de `[ \t\n\x0B\f\r]`;
- `\w` es un carácter alfanumérico (palabra), abreviatura de `[a-zA-Z_0-9]`;
- `\b` es un límite de palabra. Este es un poco más complicado: no coincide con ningún carácter específico, sino que coincide con un límite entre un carácter alfanumérico y un carácter no alfanumérico (por ejemplo, un carácter de espacio en blanco) o un límite de la cadena (el final o el inicio de ella). De esta manera, "\ba" coincide con cualquier secuencia de caracteres alfanuméricos que comience con "a", "a\b" coincide con cualquier secuencia de caracteres alfanuméricos que termine con "a" y "\ba\b" coincide con una "a" separada precedida y seguida por caracteres no alfanuméricos.

También hay contrapartes de estas abreviaturas que son equivalentes a los conjuntos restrictivos y coinciden con todo, excepto con los caracteres mencionados anteriormente:

- `\D` es un no dígito, abreviatura de `[^0-9]`;
- `\S` es un carácter que no es un espacio en blanco, abreviatura de `[^ \t\n\x0B\f\r]`;
- `\W` es un carácter no alfanumérico, abreviatura de `[^a-zA-Z_0-9]`.
- `\B` es un límite no de palabra. Coincide con la situación opuesta a la de la abreviatura `\b`: encuentra su coincidencia cada vez que no hay un "espacio" entre caracteres alfanuméricos. Por ejemplo, "a\B" coincide con una parte de una cadena que comienza con "a" seguida por cualquier carácter alfanumérico pero sin es fin de palabra.



