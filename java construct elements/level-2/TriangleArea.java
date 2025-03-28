import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        
        // Calculating area
        double areaInSquareInches = 0.5 * base * height;
        double areaInSquareCm = areaInSquareInches * 6.4516; // 1 square inch = 6.4516 square cm
        
        // Displaying results
        System.out.println("The area of the triangle is " + areaInSquareInches + " square inches and " 
                            + areaInSquareCm + " square centimeters.");
        
        scanner.close();
    }
}
