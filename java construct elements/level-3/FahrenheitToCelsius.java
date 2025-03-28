import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Convert Fahrenheit to Celsius using the formula: (°F - 32) * 5/9 = °C
        double celsiusResult = (fahrenheit - 32) * 5/9;
        
        // Display the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
        
        scanner.close();
    }
}

