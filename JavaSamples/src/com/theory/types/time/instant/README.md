# Instant
Representa un punto concreto en el tiempo. Puede usarse para guardar eventos en una aplicación.

Ver la clase [java.time.Instant](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/Instant.html) para más información.

<details>
<summary><h2>Métodos estáticos</h2></summary>

<details>
<summary><h3>from(TemporalAccessor temporal)</h3></summary>

Devuelve una instancia `Instant` de un objeto `TemporalAccesor`.

#### Ejemplo
```java
Instant instante = Instant.from(ZonedDateTime.now());
System.out.println(instante);
```
> Imprime: 2022-12-02T19:31:53.004397Z
</details>

<details>
<summary><h3>now()</h3></summary>

Obtiene el instante actual del reloj del sistema.

#### Ejemplo
```java
Instant instante = Instant.now();
System.out.println(instante);
```
> Imprime: 2022-12-02T19:33:32.074515Z
</details>

<details>
<summary><h3>now(Clock clock)</h3></summary>

Obtiene el instante actual del reloj especificado.

#### Ejemplo
```java
Clock reloj = Clock.systemUTC();
Instant instante = Instant.now(reloj);
System.out.println(instante);
```
> Imprime: 2022-12-02T19:36:00.280106Z
</details>

<details>
<summary><h3>ofEpochMilli(long epochMilli)</h3></summary>

Obtiene una instancia de `Instant` usando los milisegundos desde el epoch de 1970-01-01T00:00:00Z.

#### Ejemplo
```java
Instant instante = Instant.ofEpochMilli(1_000_000_000_000L);
System.out.println(instante);
```
> Imprime: 2001-09-09T01:46:40Z
</details>

<details>
<summary><h3>ofEpochSecond(long epochSecond)</h3></summary>

Obtiene una instancia de `Instant` usando los segundos desde el epoch de 1970-01-01T00:00:00Z.

#### Ejemplo
```java
Instant instante = Instant.ofEpochSecond(6_000_000_000L);
System.out.println(instante);
```
> Imprime: 2160-02-18T10:40:00Z
</details>

<details>
<summary><h3>ofEpochSecond(long epochSecond, long nanoAdjustment)</h3></summary>

Obtiene una instancia de `Instant` usando los segundos y nanosegundos desde el epoch de 1970-01-01T00:00:00Z.

#### Ejemplo
```java
Instant instante = Instant.ofEpochSecond(6_000_000_000L, 85001);
System.out.println(instante);
```
> Imprime: 2160-02-18T10:40:00.000085001Z
</details>

<details>
<summary><h3>parse(CharSequence text)</h3></summary>

Obtiene una instancia de `Instant` desde un String como "2007-12-03T10:15:30.00Z".

#### Ejemplo
```java
Instant instante = Instant.parse("2000-06-22T12:45:15Z");
System.out.println(instante);
```
> Imprime: 2000-06-22T12:45:15Z
</details>

</details>

<details>
<summary><h2>Métodos de instancia</h2></summary>

<details>
<summary><h3>adjustInto(Temporal temporal)</h3></summary>

Ajusta el `Temporal` especificado tener el valor del instante.

**Es mejor utilizar el método `with`.**

```java
// Ambos son equivalentes, pero es mejor la segunda opción
temporal = thisInstant.adjustInto(temporal); 
temporal = temporal.with(thisInstant);      
```

#### Ejemplo
```java
Instant instante = Instant.parse("2000-06-22T12:45:15Z");
Temporal instanteActual = ZonedDateTime.now();
instanteActual = instante.adjustInto(instanteActual);
System.out.println(instanteActual);
```
> Imprime: 2000-06-22T14:45:15+02:00[Europe/Madrid]
</details>

<details>
<summary><h3>atOffset(ZoneOffset offset)</h3></summary>

Combina este instante con un `ZoneOffset` para crear un `OffsetDateTime`.

#### Ejemplo
```java
Instant instante = Instant.parse("2000-06-22T12:45:15Z");
System.out.println(instante.atOffset(ZoneOffset.ofHours(-5)));
```
> Imprime: 2000-06-22T07:45:15-05:00
</details>

<details>
<summary><h3>atZone(ZoneId zone)</h3></summary>

Combina este instante con un `ZoneId` para crear un `ZonedDateTime`.

#### Ejemplo
```java
Instant instante = Instant.now();
System.out.println(instante.atZone(ZoneId.of("America/Chicago")));
```
> Imprime: 2022-12-02T14:25:18.771551-06:00[America/Chicago]
</details>

<details>
<summary><h3>compareTo(Instant otherInstant)</h3></summary>
Compara este instante con otro.

#### Ejemplo
```java
Instant instante = Instant.now();
Instant otroInstante = Instant.parse("2000-06-22T12:45:15Z");
System.out.println(instante.compareTo(otroInstante));
```
> Imprime: 1
</details>

<details>
<summary><h3>equals(Object other)</h3></summary>

Devuelve `true` si un instante es igual a otro.

#### Ejemplo
```java
Instant instante = Instant.parse("2000-06-22T12:45:15Z");
Instant otroInstante = Instant.parse("2000-06-22T12:45:15Z");
System.out.println(instante.equals(otroInstante));
```
> Imprime: `true`
</details>

<details>
<summary><h3>get(TemporalField field)</h3></summary>

Devuelve el valor del campo especificado de este instante como `int`.

Campos admitidos:
- NANO_OF_SECOND
- MICRO_OF_SECOND
- MILLI_OF_SECOND

#### Ejemplo
```java
Instant instante = Instant.now();
System.out.println(instante.get(ChronoField.NANO_OF_SECOND));
```
> Imprime: 516345000
</details>

<details>
<summary><h3>getEpochSecond()</h3></summary>
Obtiene el número de segundos desde el Java epoch de 1970-01-01T00:00:00Z.

#### Ejemplo
```java
Instant instante = Instant.now();
System.out.println(instante.getEpochSecond());
```
> Imprime: 1670013590
</details>

<details>
<summary><h3>getLong(TemporalField field)</h3></summary>

Devuelve el valor del campo especificado de este instante como `long`.

Campos admitidos:
- NANO_OF_SECOND
- MICRO_OF_SECOND
- MILLI_OF_SECOND
- INSTANT_OF_SECOND

#### Ejemplo
```java
Instant instante = Instant.now();
System.out.println(instante.getLong(ChronoField.INSTANT_SECONDS));
```
> Imprime: 1670013934
</details>

<details>
<summary><h3>getNano()</h3></summary>

Devuelve el número de nanosegundos.

#### Ejemplo
```java
Instant instante = Instant.now();
System.out.println(instante.getNano());
```
> Imprime: 171593000
</details>

<details>
<summary><h3>hashCode()</h3></summary>
Devuelve el hash code del instante.

#### Ejemplo
```java
Instant instante = Instant.now();
System.out.println(instante.hashCode());
```
> Imprime: 21316448
</details>

<details>
<summary><h3>isAfter(Instant otherInstant)</h3></summary>
Comprueba si el instante es posterior al instante pasado como argumento.

#### Ejemplo
```java
Instant instanteActual = Instant.now();
Instant instanteAnterior = Instant.parse("2000-06-22T12:45:15Z");
Instant instantePosterior = Instant.parse("2030-06-22T12:45:15Z");
System.out.println(instanteActual.isAfter(instanteAnterior));
System.out.println(instanteActual.isAfter(instantePosterior));
```
> Imprime: `true`, `false`
</details>

<details>
<summary><h3>isBefore(Instant otherInstant)</h3></summary>
Comprueba si el instante es anterior al instante pasado como argumento.

#### Ejemplo
```java
Instant instanteActual = Instant.now();
Instant instanteAnterior = Instant.parse("2000-06-22T12:45:15Z");
Instant instantePosterior = Instant.parse("2030-06-22T12:45:15Z");
System.out.println(instanteActual.isBefore(instanteAnterior));
System.out.println(instanteActual.isBefore(instantePosterior));
```
> Imprime: `false`, `true`
</details>

<details>
<summary><h3>isSupported(TemporalField field)</h3></summary>
Comprueba si el campo especificado es válido.

Campos admitidos:
- NANO_OF_SECOND
- MICRO_OF_SECOND
- MILLI_OF_SECOND
- INSTANT_OF_SECOND

#### Ejemplo
```java
Instant instanteActual = Instant.now();
System.out.println(instanteActual.isSupported(ChronoField.MILLI_OF_SECOND));
```
> Imprime: `true`
</details>

<details>
<summary><h3>isSupported(TemporalUnit unit)</h3></summary>
Comprueba si el campo especificado es válido.

Campos admitidos:
- NANOS
- MICROS
- MILLIS
- SECONDS
- MINUTES
- HOURS
- HALF_DAYS
- DAYS

#### Ejemplo
```java
Instant instanteActual = Instant.now();
System.out.println(instanteActual.isSupported(ChronoUnit.DAYS));
```
> Imprime: `true`
</details>

<details>
<summary><h3>minus(long amountToSubtract, TemporalUnit unit)</h3></summary>
Devuelve una copia de este instante con la cantidad especificada substraída.

#### Ejemplo
```java
Instant instanteActual = Instant.now();
System.out.println(instanteActual);
System.out.println(instanteActual.minus(5, ChronoUnit.DAYS));
```
> Imprime: "2022-12-03T10:41:43.452879Z", "2022-11-28T10:41:43.452879Z"
</details>

<details>
<summary><h3>minus(TemporalAmount amountToSubtract)</h3></summary>
Devuelve una copia de este instante con la cantidad especificada substraída.

#### Ejemplo
```java
Instant instanteActual = Instant.now();
Instant instanteActual = Instant.now();
System.out.println(instanteActual);
System.out.println(instanteActual.minus(Period.ofDays(40)));
```
> Imprime: "2022-12-03T10:45:38.455269Z", "2022-10-24T10:45:38.455269Z"
</details>

<details>
<summary><h3>minusMillis(long millisToSubtract)</h3></summary>
Devuelve una copia de este instante con la cantidad de milisegundos especificada substraída.
</details>

<details>
<summary><h3>minusNanos(long nanosToSubtract)</h3></summary>
Devuelve una copia de este instante con la cantidad de nanosegundos especificada substraída.
</details>

<details>
<summary><h3>minusSeconds(long secondsToSubtract)</h3></summary>
Devuelve una copia de este instante con la cantidad de segundos especificada substraída.
</details>

<details>
<summary><h3>plus(long amountToAdd, TemporalUnit unit)</h3></summary>
Devuelve una copia de este instante con la cantidad especificada añadida.
</details>

<details>
<summary><h3>plus(TemporalAmount amountToAdd)</h3></summary>
Devuelve una copia de este instante con la cantidad especificada añadida.
</details>

<details>
<summary><h3>plusMillis(long millisToAdd)</h3></summary>
Devuelve una copia de este instante con la cantidad de milisegundos especificada añadida.
</details>

<details>
<summary><h3>plusNanos(long nanosToAdd)</h3></summary>
Devuelve una copia de este instante con la cantidad de nanosegundos especificada añadida.
</details>

<details>
<summary><h3>plusSeconds(long secondsToAdd)</h3></summary>
Devuelve una copia de este instante con la cantidad de segundos especificada añadida.
</details>

<details>
<summary><h3>query(TemporalQuery<R> query)</h3></summary>
Realiza una consulta de este instante utilizando la consulta especificada.

#### Ejemplo
```java
Instant instanteActual = Instant.now();
System.out.println(instanteActual.query(TemporalQueries.precision()));
```
> Imprime: "Nanos"
</details>

<details>
<summary><h3>range(TemporalField field)</h3></summary>
Devuelve el rango del campo especificado.

#### Ejemplo
```java
Instant instanteActual = Instant.now();
System.out.println(instanteActual.range(ChronoField.MILLI_OF_SECOND));
```
> Imprime: 0 - 999
</details>

<details>
<summary><h3>toEpochMilli()</h3></summary>
Convierte este instante al número de milisegundos desde el epoch de 1970-01-01T00:00:00Z.

#### Ejemplo
```java
Instant instanteActual = Instant.now();
System.out.println(instanteActual.toEpochMilli());
```
> Imprime: 1670065561691
</details>

<details>
<summary><h3>toString()</h3></summary>
Devuelve un String con la representación de este instante usando la representación ISO-8601.

#### Ejemplo
```java
Instant instanteActual = Instant.now();
System.out.println(instanteActual.toString());
```
> Imprime: 2022-12-03T11:06:33.732490Z
</details>

<details>
<summary><h3>truncatedTo(TemporalUnit unit)</h3></summary>
Devuelve una copia de este instante con los valores menores a la unidad pasada como argumento serán 0.

Por ejemplo, si se pasa "Days", los valores de Horas, Minutos, etc... serán 0.

#### Ejemplo
```java
Instant instanteActual = Instant.now();
System.out.println(instanteActual.truncatedTo(ChronoUnit.DAYS));
```
> Imprime: 2022-12-03T00:00:00Z
</details>

<details>
<summary><h3>until(Temporal endExclusive, TemporalUnit unit)</h3></summary>
Calcula la diferencia de tiempo con el instante pasado como argumento en función de la unidad especificada.

#### Ejemplo
```java
Instant instante = Instant.now();
Instant otroInstante = Instant.parse("2022-12-15T00:00:00Z");
System.out.println(instante.until(otroInstante, ChronoUnit.HOURS));
```
> Imprime: 276
</details>

<details>
<summary><h3>with(TemporalAdjuster adjuster)</h3></summary>
Devuelve una copia ajustada de este instante.
</details>

<details>
<summary><h3>with(TemporalField field, long newValue)</h3></summary>
Devuelve una copia de este instante con el nuevo valor del campo especificado .
</details>

</details>

