# SQL (Structured Query Language)

`SQL` es un lenguaje de programación específico del dominio diseñado para manejar datos en tablas. Fue desarrollado en la década de 1970 y hasta el día de hoy, las interfaces similares a `SQL` son muy populares en diversos sistemas de gestión de datos, no solo en los basados en tablas. Por ejemplo, el backend del sistema de información de una compañía de seguros puede utilizar `SQL` para extraer y actualizar datos sobre sus clientes.

## Calculando estadísticas

`SQL` hace más fácil agregar datos y calcular estadísticas. Supongamos que necesitas evaluar los cambios en la popularidad del nombre Jessie entre 1920 y 2000 (inclusive) basándote en datos del censo. Utilizando `SQL`, puedes completar esta tarea con solo 11 líneas de código. Selecciona registros sobre individuos llamados 'Jessie' que nacieron ENTRE 1920 y 2000. Los agrupa por año y género, cuenta el número de registros en cada grupo a través de `COUNT(*)`, y genera una tabla con columnas llamadas año, género y cnt. También ordena la tabla por año y género en orden descendente.

La tabla "censo":

| id  | year | name   | gender |
| --- | ---- | ------ | ------ |
| 1   | 2000 | Jessie | M      |
| 2   | 1880 | Kelly  | F      |
| 3   | 1985 | Willie | M      |
| 4   | 2018 | Taylor | M      |
| ... | ...  | ...    | ...    |
| N   | 1946 | Jessie | F      |

La consulta:

```sql
SELECT
  year, gender, COUNT(*) as cnt
FROM
  census
WHERE
  year BETWEEN 1920 and 2000
  AND name = 'Jessie'
GROUP BY
  year, gender
ORDER BY
  year, gender DESC
```

El resultado de la evaluación de la consulta:

| year        | gender | cnt  |
| ----------- | ------ | ---- |
| 1920        | M      | 1590 |
| 1920        | F      | 3329 |
| ...         | ...    | ...  |
| 1960        | M      | 935  |
| 1960        | F      | 509  |
| ... ... ... |
| 2000        | M      | 533  |
| 2000        | F      | 710  |


## S es para Structured

`SQL` es un lenguaje utilizado para extraer y actualizar datos estructurados en forma de tablas. Este tipo de datos aparece en varias áreas de aplicación, como hojas de cálculo de Excel que contienen datos contables o estadísticas del censo en Google BigQuery. Otro ejemplo es una tienda en línea que utiliza un sistema de software especial para almacenar y acceder a tablas, conocido como Sistema de Gestión de Bases de Datos Relacionales (RDBMS). Estos pueden ayudar a procesar la información sobre productos, pedidos y clientes.

`SQL` está destinado a ser utilizado con tablas que tienen una estructura particular:

Las tablas contienen filas y columnas. Cada fila es un objeto o entidad que tiene un conjunto de propiedades o atributos. Por ejemplo, la tercera fila contiene datos sobre Willie, un hombre nacido en 1985.
Los datos a menudo se organizan en un conjunto de tablas, conocido como base de datos. Luego es posible acceder a estas tablas utilizando sus nombres individuales. Por ejemplo, en la base de datos de una tienda en línea, una tabla llamada `Clientes` probablemente contenga información general sobre los clientes de la empresa: sus nombres y datos de contacto. La tabla `Pedidos` almacenaría información sobre los pedidos específicos que realizan: nombres de clientes, productos y detalles de pago.

## Q es para Query

`SQL` es un lenguaje de programación con un gran conjunto de características de procesamiento de datos. Es declarativo, lo que significa que una declaración escrita en `SQL` es una consulta que le dice al sistema qué debe hacerse o evaluarse pero no especifica cómo.

En el siguiente ejemplo, una consulta extrae todas las filas y columnas de la tabla Censo:

```sql
SELECT * FROM Census;
```

El símbolo `*` se utiliza para seleccionar todas las columnas de la tabla.

Es necesario finalizar cada declaración `SQL` con un punto y coma, también conocido como terminador de declaración. De lo contrario, habrá un error. Un punto y coma puede omitirse solo si haces una consulta en una sola línea.

La palabra clave `SELECT` especifica qué columnas de la tabla deben incluirse en el resultado de la consulta. La palabra clave `FROM` especifica de qué tabla se deben extraer los datos. La cláusula `WHERE` es opcional y permite filtrar los resultados de la consulta por ciertas condiciones. La cláusula `GROUP BY` agrupa los resultados por una o varias columnas. La cláusula `ORDER BY` ordena los resultados por una o varias columnas.

## L es para Language

`SQL` es un lenguaje de programación diseñado para trabajar con datos. Contiene un conjunto de instrucciones y reglas para crear, modificar, consultar y eliminar datos de las tablas. También incluye sintaxis y funciones para realizar operaciones matemáticas y lógicas sobre los datos.

Por ejemplo, para insertar un nuevo registro en la tabla Clientes de la base de datos de una tienda en línea, se puede utilizar la siguiente declaración SQL:

```sql
INSERT INTO Customers (name, email, phone)
VALUES ('John Doe', 'johndoe@gmail.com', '555-123-4567');
```

La palabra clave `INSERT INTO` especifica que se está insertando un nuevo registro en la tabla Clientes. Las columnas entre paréntesis especifican qué columnas deben incluirse en el nuevo registro. La palabra clave VALUES especifica los valores para cada columna.

Existen muchas otras instrucciones y funciones disponibles en `SQL`, y se pueden utilizar para realizar una amplia variedad de tareas de procesamiento de datos. Es un lenguaje poderoso y muy versátil que es ampliamente utilizado en empresas de todo el mundo.
