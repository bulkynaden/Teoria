package es.dim45.helpers;

public final class UnitConverter {
  private UnitConverter() {
  }

  private static class Common {
    static double opposite(double valor) {
      return 1 / valor;
    }
  }

  /**
   * Clase estática para conversiones de pesos.
   */
  public static class Weight {
    private static final double CENTIGRAMS_GRAMS = 0.01;
    private static final double DEKAGRAMS_GRAMS = 10;
    private static final double DRAMS_GRAMS = 1.7718;
    private static final double DRAMS_OUNCES = 0.0625;
    private static final double HECTOGRAMS_GRAMS = 100;
    private static final double KILOGRAMS_OUNCES = 32.1507;
    private static final double KILOGRAMS_POUNDS = 2.20462;
    private static final double KILOGRAMS_TONS = 0.001;
    private static final double KILOGRAMS_GRAMS = 1000;
    private static final double MICROGRAMS_GRAMS = 1E-06;
    private static final double MILLIERS_KILOGRAMS = 1000;
    private static final double MILIGRAMS_GRAMS = 0.001;
    private static final double OUNCES_POUNDS = 0.0625;

    public static double ouncesToPounds(double ounces) {
      return ounces * OUNCES_POUNDS;
    }

    public static double poundsToOunces(double pounds) {
      return pounds * Common.opposite(OUNCES_POUNDS);
    }

    public static double milligramsToGrams(double milligrams) {
      return milligrams * MILIGRAMS_GRAMS;
    }

    public static double gramsToMilligrams(double grams) {
      return grams * Common.opposite(MILIGRAMS_GRAMS);
    }

    public static double milliersToKilograms(double milliers) {
      return milliers * MILLIERS_KILOGRAMS;
    }

    public static double kilogramsToMilliers(double kilograms) {
      return kilograms * Common.opposite(MILLIERS_KILOGRAMS);
    }

    public static double microgramsToGrams(double micrograms) {
      return micrograms * MICROGRAMS_GRAMS;
    }

    public static double gramsToMicrograms(double grams) {
      return grams * Common.opposite(MICROGRAMS_GRAMS);
    }

    public static double kilogramsToGrams(double kilograms) {
      return kilograms * KILOGRAMS_GRAMS;
    }

    public static double gramsToKilograms(double grams) {
      return grams * Common.opposite(KILOGRAMS_GRAMS);
    }

    public static double kilogramsToTons(double kilograms) {
      return kilograms * KILOGRAMS_TONS;
    }

    public static double tonsToKilograms(double tons) {
      return tons * Common.opposite(KILOGRAMS_TONS);
    }

    public static double kilogramsToPounds(double kilograms) {
      return kilograms * KILOGRAMS_POUNDS;
    }

    public static double poundsToKilograms(double pounds) {
      return pounds * Common.opposite(KILOGRAMS_POUNDS);
    }

    public static double kilogramsToOunces(double kilograms) {
      return kilograms * KILOGRAMS_OUNCES;
    }

    public static double ouncesToKilograms(double ounces) {
      return ounces * Common.opposite(KILOGRAMS_OUNCES);
    }

    public static double hectogramsToGrams(double hectograms) {
      return hectograms * HECTOGRAMS_GRAMS;
    }

    public static double gramsToHectograms(double grams) {
      return grams * Common.opposite(HECTOGRAMS_GRAMS);
    }

    public static double dramsToOunces(double drams) {
      return drams * DRAMS_OUNCES;
    }

    public static double ouncesToDrams(double ounces) {
      return ounces * Common.opposite(DRAMS_OUNCES);
    }

    public static double dramsToGrams(double drams) {
      return drams * DRAMS_GRAMS;
    }

    public static double gramsToDrams(double grams) {
      return grams * Common.opposite(DRAMS_GRAMS);
    }

    public static double dekagramsToGrams(double dekagrams) {
      return dekagrams * DEKAGRAMS_GRAMS;
    }

    public static double gramsToDekagrams(double grams) {
      return grams * Common.opposite(DEKAGRAMS_GRAMS);
    }

    public static double centigramsToGrams(double centigrams) {
      return centigrams * CENTIGRAMS_GRAMS;
    }

    public static double gramsToCentigrams(double grams) {
      return grams * Common.opposite(CENTIGRAMS_GRAMS);
    }
  }
}
