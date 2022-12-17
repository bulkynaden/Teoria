# Time

Ver el paquete [java.time](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/package-summary.html) para más información.

## LocalDate
Representa una fecha sin la hora y nos facilita su manejo para declararlas, sumar y restar fechas y compararlas.

## LocalTime
Clase para el manejo de horas, sin ninguna fecha asociada, pudiendo así compararlas, sumar o restar tiempo a las mismas.

## LocalDateTime
Combinación de `LocalDate` y `LocalTime` que permite hacer lo mismo con fechas y horas simultáneamente.ç

## Instant
Se usa para almacenar un punto determinado en el tiempo, o sea con fecha y hora, pero guarda su valor como un timestamp de UNIX, es decir, en nanosegundos desde el epoch de UNIX (1/1/1970 a las 00:00) y usando la zona horaria UTC.

## ZonedDateTime
Es una clase como `LocalDateTime` pero teniendo en cuenta una zona horaria concreta.

## Period
Es una clase auxiliar nos ayuda a obtener diferencias entre fechas en distintos periodos (segundos, minutos, días...) y también a añadir esas diferencias a las fechas.

## Duration 
Clase similar a `Duration` pero únicamente para horas.