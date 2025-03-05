import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        
        // Calculating side length
        double side = perimeter / 4;
        
        // Displaying result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        scanner.close();
    }
}
