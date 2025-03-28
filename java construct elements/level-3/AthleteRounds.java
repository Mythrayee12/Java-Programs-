import java.util.Scanner;
public class AthleteRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take inputs for the sides of the triangular park
        System.out.print("Enter side1 in meters: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2 in meters: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3 in meters: ");
        double side3 = scanner.nextDouble();
        
        // Calculate perimeter
        double perimeter = side1 + side2 + side3;
        
        // Calculate required rounds to complete 5km
        double rounds = 5000 / perimeter;
        
        // Display number of rounds
        System.out.println("The total number of rounds the athlete will run is " + rounds);
        
        scanner.close();
    }
}

