package es.dim45.operations;

import java.util.IllegalFormatConversionException;
import java.util.Locale;

public final class NumberOperations {
  private NumberOperations() {
  }

  /**
   * Devuelve el número pasado formateado con N decimales.
   *
   * @param <T>              Cualquier tipo que herede de Number
   * @param number           Número que se quiere formatear
   * @param numberOfDecimals Número de decimales
   * @return String con el número formateado.
   */
  public static <T extends Number> String formatWithNDecimals(T number, int numberOfDecimals) {
    String text;
    try {
      text = String.format(Locale.ENGLISH, "%." + numberOfDecimals + "f", number);
    } catch (IllegalFormatConversionException e) {
      text = number.toString();
    }
    return text;
  }

  /**
   * Devuelve el número pasado formateado con N decimales y coma en lugar de
   * punto.
   *
   * @param <T>              Cualquier tipo que herede de Number
   * @param number           Número que se quiere formatear
   * @param numberOfDecimals Número de decimales
   * @return String con el número formateado.
   */
  public static <T extends Number> String formatWithNDecimalsAndComma(T number, int numberOfDecimals) {
    String text;
    try {
      text = String.format(new Locale("es"), "%." + numberOfDecimals + "f", number);
    } catch (IllegalFormatConversionException e) {
      text = number.toString();
    }
    return text;
  }
}