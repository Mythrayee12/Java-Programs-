import java.util.Scanner;

public class BMICalculator {
    
    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // Convert cm to meters
        return weight / (heightM * heightM); // BMI formula (kg/m^2)
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3]; // 2D array: [weight, height, BMI]
        String[] status = new String[10]; // Array to store BMI status

        // Taking user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            teamData[i][0] = scanner.nextDouble();
            
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            teamData[i][1] = scanner.nextDouble();

            // Calculate BMI and store it
            teamData[i][2] = calculateBMI(teamData[i][0], teamData[i][1]);
            
            // Determine BMI status
            status[i] = getBMIStatus(teamData[i][2]);
        }

        // Display results
        System.out.println("\nBMI Report:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], status[i]);
        }

        scanner.close();
    }
}

