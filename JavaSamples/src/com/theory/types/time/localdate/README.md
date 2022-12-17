# LocalDate
Representa una fecha sin la hora y nos facilita su manejo para declararlas, sumar y restar fechas y compararlas.

Ver la clase [java.time.LocalDate](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/LocalDate.html) para más información.

<details>
<summary><h2>Métodos estáticos</h2></summary>

<details>
<summary><h3>from(TemporalAccessor temporal)</h3></summary>

Devuelve una instancia `LocalDate` de un objeto `TemporalAccesor`.

#### Ejemplo
```java
LocalDate date = LocalDate.from(ZonedDateTime.now());
System.out.println(date);
```
> Imprime: 2022-12-03
</details>

<details>
<summary><h3>now()</h3></summary>

Obtiene la fecha actual del reloj del sistema.

#### Ejemplo
```java
LocalDate date = LocalDate.now();
System.out.println(date);
```
> Imprime: 2022-12-03
</details>

<details>
<summary><h3>now(Clock clock)</h3></summary>

Obtiene la fecha actual del reloj especificado.

#### Ejemplo
```java
Clock reloj = Clock.systemUTC();
LocalDate fecha = LocalDate.now(reloj);
System.out.println(fecha);
```
> Imprime: 2022-12-03
</details>

<details>
<summary><h3>of(int year, int month, int dayOfMonth)</h3></summary>

Obtiene la fecha a partir de los argumentos pasados.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2012, 2, 27);
System.out.println(fecha);
```
> Imprime: 2012-02-27
</details>

<details>
<summary><h3>of(int year, Month month, int dayOfMonth)</h3></summary>

Obtiene la fecha a partir de los argumentos pasados.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(1988, Month.APRIL, 27);
System.out.println(fecha);
```
> Imprime: 1988-04-27
</details>

<details>
<summary><h3>ofEpochDay(long epochDay)</h3></summary>

Obtiene la fecha a partir de la cantidad de días especificada desde el epoch.

#### Ejemplo
```java
LocalDate fecha = LocalDate.ofEpochDay(2780);
System.out.println(fecha);
```
> Imprime: 1977-08-12
</details>

<details>
<summary><h3>ofInstant(Instant instant, ZoneId zone)</h3></summary>

Obtiene la fecha a partir del instante pasado como argumento y la `ZoneId`.

#### Ejemplo
```java
LocalDate fecha = LocalDate.ofInstant(Instant.now(), ZoneId.of("Asia/Karachi"));
System.out.println(fecha);
```
> Imprime: 2022-12-03
</details>

<details>
<summary><h3>ofYearDay(int year, int dayOfYear)</h3></summary>

Obtiene la fecha a partir del año especificado y los días de ese año.

#### Ejemplo
```java
LocalDate fecha = LocalDate.ofYearDay(2000, 243);
System.out.println(fecha);
```
> Imprime: 2000-08-30
</details>

<details>
<summary><h3>parse(CharSequence text)</h3></summary>

Obtiene una fecha desde un String como "2007-12-03".

#### Ejemplo
```java
LocalDate fecha = LocalDate.parse("2007-12-03");
System.out.println(fecha);
```
> Imprime: 2007-12-03
</details>

<details>
<summary><h3>parse(CharSequence text, DateTimeFormatter formatter)</h3></summary>

Obtiene una fecha desde un String y el formato específico del String.

#### Ejemplo
```java
LocalDate fecha = LocalDate.parse("05/11/1998", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
System.out.println(fecha);
```
> Imprime: 1998-11-05
</details>

</details>

<details>
<summary><h2>Métodos de instancia</h2></summary>

<details>
<summary><h3>atStartOfDay()</h3></summary>

Combina esta fecha con la hora de medianoche para crear un `LocalDateTime`.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2020, 1, 15);
System.out.println(fecha.atStartOfDay());
```
> Imprime: 2020-01-15T00:00
</details>

<details>
<summary><h3>atStartOfDay(ZoneId zone)</h3></summary>

Combina esta fecha con la hora de medianoche y la `ZoneId` pasada como argumento para crear un `ZonedDateTime`.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2020, 1, 15);
System.out.println(fecha.atStartOfDay(ZoneId.of("Japan")));
```
> Imprime: 2020-01-15T00:00+09:00[Japan]
</details>

<details>
<summary><h3>atTime(int hour, int minute)</h3></summary>

Combina esta fecha con la hora y minuto pasados como argumento para crear un `LocalDateTime`.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2020, 1, 15);
System.out.println(fecha.atTime(15, 20));
```
> Imprime: 2020-01-15T15:20
</details>

<details>
<summary><h3>atTime(int hour, int minute, int second)</h3></summary>

Combina esta fecha con la hora, minuto y segundos pasados como argumento para crear un `LocalDateTime`.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2020, 1, 15);
System.out.println(fecha.atTime(15, 20, 59));
```
> Imprime: 2020-01-15T15:20:59
</details>

<details>
<summary><h3>atTime(int hour, int minute, int second, int nanoOfSecond)</h3></summary>

Combina esta fecha con la hora, minuto, segundo y nanosegundos pasados como argumento para crear un `LocalDateTime`.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2020, 1, 15);
System.out.println(fecha.atTime(15, 20, 59, 500));
```
> Imprime: 2020-01-15T15:20:59.000000500
</details>

<details>
<summary><h3>atTime(LocalTime time)</h3></summary>

Combina esta fecha con un `LocalTime` para crear un `LocalDateTime`.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2020, 1, 15);
LocalTime tiempo = LocalTime.of(15, 45, 50);
System.out.println(fecha.atTime(tiempo));
```
> Imprime: 2020-01-15T15:45:50
</details>

<details>
<summary><h3>atTime(OffsetTime time)</h3></summary>

Combina esta fecha con un `OffsetTime` para crear un `OffsetDateTime`.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2020, 1, 15);
OffsetTime tiempo = OffsetTime.now(ZoneId.systemDefault());
System.out.println(fecha.atTime(tiempo));
```
> Imprime: 2020-01-15T17:07:38.813298+01:00
</details>

<details>
<summary><h3>compareTo(ChronoLocalDate other)</h3></summary>

Compara esta fecha con otra.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2020, 1, 15);
LocalDate fechaAhora = LocalDate.now();
System.out.println(fecha.compareTo(fechaAhora));
```
> Imprime: -2
</details>

<details>
<summary><h3>datesUntil(LocalDate endExclusive)</h3></summary>

Devuelve un `Stream` ordenado de fechas.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2022, 11, 30);
LocalDate fechaAhora = LocalDate.now();
fecha.datesUntil(fechaAhora).forEach(System.out::println);
```
> Imprime: 2022-11-30, 2022-12-01, 2022-12-02
</details>

<details>
<summary><h3>datesUntil(LocalDate endExclusive, Period step)</h3></summary>

Devuelve un `Stream` ordenado de fechas con el salto especificado.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2022, 10, 30);
LocalDate fechaAhora = LocalDate.now();
fecha.datesUntil(fechaAhora, Period.ofWeeks(1)).forEach(System.out::println);
```
> Imprime: 2022-10-30, 2022-11-06, 2022-11-13, 2022-11-20, 2022-11-27
</details>

<details>
<summary><h3>equals(Object obj)</h3></summary>

Comprueba si esta fecha es igual a otra

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(2022, 10, 30);
LocalDate fechaAhora = LocalDate.now();
System.out.println(fecha.equals(fechaAhora));
```
> Imprime: `false`
</details>

<details>
<summary><h3>format(DateTimeFormatter formatter)</h3></summary>

Formatea la fecha de acuerdo al formato especificado. Para poder escribir palabras "normales", hay que usar comillas simples 'palabra'.

| Descripción | Código | Ejemplo |
| --- | --- | --- |
| Día | d | 5 |
| Día | dd | 05 |
| Día de la semana | e | 7 |
| Día de la semana | ee | 07 |
| Día de la semana | eee | Sun |
| Día de la semana | eeee | Sunday |
| Día de la semana | eeeee | S |
| Día del año | D | 212
| Mes | M | 9 |
| Mes | MM | 09 |
| Mes | MMM | Sep |
| Mes | MMMM | September |
| Mes | MMMMM | S |
| Año | y | 2022 |
| Año | yy | 22 |

Más info en: [DateTimeFormatter](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html)

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(1988, 9, 3);
System.out.println(fecha.format(DateTimeFormatter.ofPattern("'La fecha es' eeee, d 'de' MMMM 'del año' y", new Locale("es", "ES"))));
```
> Imprime: "La fecha es sábado, 3 de septiembre del año 1988"
</details>

<details>
<summary><h3>get(TemporalField field)</h3></summary>

Obtiene el valor del campo especificado de esta fecha como `int`.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(1988, 9, 3);
System.out.println(fecha.get(ChronoField.DAY_OF_WEEK));
```
> Imprime: 6
</details>

<details>
<summary><h3>getChronology()</h3></summary>

Obtiene el sistema del calendario de esta fecha.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(1988, 9, 3);
System.out.println(fecha.getChronology());
```
> Imprime: "ISO"
</details>

<details>
<summary><h3>get...</h3></summary>

Obtiene el mes, el año, el día de la semana... etc, según el método seleccionado.

</details>

<details>
<summary><h3>hashCode()</h3></summary>

Obtiene el hash code de esta fecha.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(1988, 9, 3);
System.out.println(fecha.hashCode());
```
> Imprime: 4072003
</details>

<details>
<summary><h3>isAfter(ChronoLocalDate other)</h3></summary>

Comprueba si esta fecha es posterior a la fecha especificada.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(1988, 9, 3);
LocalDate fechaHoy = LocalDate.now();
System.out.println(fecha.isAfter(fechaHoy));
```
> Imprime: `false`
</details>

<details>
<summary><h3>isBefore(ChronoLocalDate other)</h3></summary>

Comprueba si esta fecha es anterior a la fecha especificada.

#### Ejemplo
```java
LocalDate fecha = LocalDate.of(1988, 9, 3);
LocalDate fechaHoy = LocalDate.now();
System.out.println(fecha.isBefore(fechaHoy));
```
> Imprime: `true`
</details>

<details>
<summary><h3>isEqual(ChronoLocalDate other)</h3></summary>

Comprueba si esta fecha es igual a la fecha especificada. A diferencia del método `equals`, devolverá `true` si las dos fechas son el mismo día aunque sean de tipos distintos.

#### Ejemplo 1
```java
LocalDate fecha = LocalDate.of(2022, 12, 3);
LocalDate fechaHoy = LocalDate.now();
System.out.println(fecha.isEqual(fechaHoy));
```
> Imprime: `true`

#### Ejemplo 2
```java
LocalDate fechaHoy = LocalDate.now();
JapaneseDate fechaHoyJapon = JapaneseDate.now();
System.out.println(fechaHoy.isEqual(fechaHoyJapon));
System.out.println(fechaHoy.equals(fechaHoyJapon));
```
> Imprime: `true` (Método isEqual), `false` (Método equals)
</details>

<details>
<summary><h3>isLeapYear()</h3></summary>

Devuelve `true` si la fecha es año bisiesto.
Checks if the year is a leap year, according to the ISO proleptic calendar system rules.

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.isLeapYear());
```
> Imprime: `false`
</details>

<details>
<summary><h3>isSupported(TemporalField field)</h3></summary>

Devuelve `true` si el campo especificado es admitido.

Campos admitidos:
- DAY_OF_WEEK
- ALIGNED_DAY_OF_WEEK_IN_MONTH
- ALIGNED_DAY_OF_WEEK_IN_YEAR
- DAY_OF_MONTH
- DAY_OF_YEAR
- EPOCH_DAY
- ALIGNED_WEEK_OF_MONTH
- ALIGNED_WEEK_OF_YEAR
- MONTH_OF_YEAR
- PROLEPTIC_MONTH
- YEAR_OF_ERA
- YEAR
- ERA

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.isSupported(ChronoField.ERA));
```
> Imprime: `true`
</details>

<details>
<summary><h3>isSupported(TemporalUnit unit)</h3></summary>

Devuelve `true` si la unidad especificada es admitido.

Campos admitidos:
- DAYS
- WEEKS
- MONTHS
- YEARS
- DECADES
- CENTURIES
- MILLENNIA
- ERAS

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.isSupported(ChronoUnit.CENTURIES));
```
> Imprime: `true`
</details>

<details>
<summary><h3>lengthOfMonth()</h3></summary>

Devuelve la cantidad de días del mes de esta fecha.

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.lengthOfMonth());
```
> Imprime: 31
</details>

<details>
<summary><h3>lengthOfYear()</h3></summary>

Devuelve la cantidad de días del año de esta fecha.

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.lengthOfYear());
```
> Imprime: 365
</details>

<details>
<summary><h3>minus...</h3></summary>

Devuelve una copia de esta fecha con la cantidad (según el método seleccionado) reducida.

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.minus(Period.of(1, 10, 21)));
System.out.println(fechaHoy.minus(2, ChronoUnit.CENTURIES));
```
> Imprime: 2021-01-13, 1822-12-03
</details>

<details>
<summary><h3>plus...</h3></summary>

Devuelve una copia de esta fecha con la cantidad (según el método seleccionado) añadida.

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.plus(Period.of(1, 10, 21)));
System.out.println(fechaHoy.plus(2, ChronoUnit.CENTURIES));
```
> Imprime: 2024-10-24, 2222-12-03
</details>

<details>
<summary><h3>query(TemporalQuery<R> query)</h3></summary>

Realiza la consulta especificada a la fecha.

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.query(TemporalQueries.precision()));
```
> Imprime: "Days"
</details>

<details>
<summary><h3>range(TemporalField field)</h3></summary>

Obtiene el rango de valores válidos del campo especificado.

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.range(ChronoField.DAY_OF_MONTH));
```
> Imprime: "1 - 31"
</details>

<details>
<summary><h3>toEpochSecond(LocalTime time, ZoneOffset offset)</h3></summary>

Obtiene el número de segundos desde el epoch de 1970-01-01T00:00:00Z

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.toEpochSecond(LocalTime.now(), ZoneOffset.of("+02:00")));
```
> Imprime: 1670085356
</details>

<details>
<summary><h3>until(ChronoLocalDate endDateExclusive)</h3></summary>

Devuelve el `Period` entre esta fecha y la fecha especificada.

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
LocalDate fechaFutura = LocalDate.of(2023, 1, 1);
System.out.println(fechaHoy.until(fechaFutura).getDays());
```
> Imprime: 29
</details>

<details>
<summary><h3>until(Temporal endExclusive, TemporalUnit unit)</h3></summary>

Devuelve el tiempo entre esta fecha y la fecha especificada según la unidad especificada.

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
LocalDate fechaFutura = LocalDate.of(2023, 1, 1);
System.out.println(fechaHoy.until(fechaFutura, ChronoUnit.WEEKS));
```
> Imprime: 4
</details>

<details>
<summary><h3>with(TemporalAdjuster adjuster)</h3></summary>

Devuelve una copia ajustada de esta fecha.

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.with(TemporalAdjusters.firstDayOfMonth()));
```
> Imprime: 2022-12-01
</details>

<details>
<summary><h3>with(TemporalField field, long newValue)</h3></summary>

Devuelve una copia de esta fecha con el campo especificado cambiado al nuevo valor

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.with(ChronoField.MONTH_OF_YEAR, 4));
```
> Imprime: 2022-04-03
</details>

<details>
<summary><h3>with...</h3></summary>

Devuelve una copia de esta fecha cambiándola según el método utilizado y el valor introducido.

#### Ejemplo
```java
LocalDate fechaHoy = LocalDate.now();
System.out.println(fechaHoy.withDayOfYear(32));
```
> Imprime: 2022-02-01
</details>

</details>
