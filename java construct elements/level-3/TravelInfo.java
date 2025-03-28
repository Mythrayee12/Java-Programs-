import java.util.Scanner;
public class TravelInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user inputs for travel details
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter From City: ");
        String fromCity = scanner.next();
        System.out.print("Enter Via City: ");
        String viaCity = scanner.next();
        System.out.print("Enter To City: ");
        String toCity = scanner.next();
        
        // Take distance inputs
        System.out.print("Enter Distance from FromCity to ViaCity in miles: ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter Distance from ViaCity to Final Destination in miles: ");
        double viaToFinalCity = scanner.nextDouble();
        
        // Take time input
        System.out.print("Enter Time Taken in hours: ");
        double timeTaken = scanner.nextDouble();
        
        // Calculate total distance and speed
        double totalDistance = fromToVia + viaToFinalCity;
        double speed = totalDistance / timeTaken;
        
        // Display travel information
        System.out.println("Traveler " + name + " traveled from " + fromCity + 
                           " to " + toCity + " via " + viaCity + ". Total distance: " +
                           totalDistance + " miles at " + speed + " mph.");
        
        scanner.close();
    }
}

