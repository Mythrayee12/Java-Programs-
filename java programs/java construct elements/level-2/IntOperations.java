import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter integer a: ");
        int a = scanner.nextInt();
        System.out.print("Enter integer b: ");
        int b = scanner.nextInt();
        System.out.print("Enter integer c: ");
        int c = scanner.nextInt();
        
        // Performing integer operations
        int result1 = a + b * c; // Multiplication happens first
        int result2 = a * b + c; // Multiplication happens first
        int result3 = c + a / b; // Division happens first
        int result4 = a % b + c; // Modulus happens first
        
        // Displaying results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
        scanner.close();
    }
}


