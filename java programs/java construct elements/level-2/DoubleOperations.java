import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter double a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter double b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter double c: ");
        double c = scanner.nextDouble();
        
        // Performing double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        
        // Displaying results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
        scanner.close();
    }
}

