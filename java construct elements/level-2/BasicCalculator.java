import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        
        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        // Displaying results
        System.out.println("The addition, subtraction, multiplication and division of two numbers " 
                            + number1 + " and " + number2 + " is " 
                            + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        
        scanner.close();
    }
}
