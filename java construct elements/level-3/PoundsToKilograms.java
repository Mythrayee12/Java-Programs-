import java.util.Scanner;
public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert weight to kilograms using the formula: 1 pound = 2.2 kg
        double weightInKg = weightInPounds / 2.2;

        // Display the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
                           " and in kilograms is " + weightInKg);

        scanner.close();
    }
}


