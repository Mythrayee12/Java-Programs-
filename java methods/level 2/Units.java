public class UnitConverter {

    // Conversion constants
    private static final double FAHRENHEIT_TO_CELSIUS_FACTOR = 5.0 / 9.0;
    private static final double CELSIUS_TO_FAHRENHEIT_FACTOR = 9.0 / 5.0;
    private static final double POUNDS_TO_KILOGRAMS = 0.453592;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * FAHRENHEIT_TO_CELSIUS_FACTOR;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * CELSIUS_TO_FAHRENHEIT_FACTOR) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }

    public static void main(String[] args) {
        // Example usage
        double fahrenheit = 98.6;
        System.out.println(fahrenheit + "°F is " + convertFahrenheitToCelsius(fahrenheit) + "°C");

        double pounds = 150;
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms");

        double gallons = 5;
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters");
    }
}
