import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Convert Celsius to Fahrenheit using the formula: (°C × 9/5) + 32 = °F
        double fahrenheitResult = (celsius * 9/5) + 32;
        
        // Display the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
        
        scanner.close();
    }
}
