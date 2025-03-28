import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        
        // Converting to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        
        // Displaying result
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
        
        scanner.close();
    }
}

