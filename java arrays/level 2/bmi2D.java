import java.util.Scanner;
class bmi2D {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of persons: ");
        int numPersons = scanner.nextInt();
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            do {
            	System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            	personData[i][0] = scanner.nextDouble();
            } while (personData[i][0] <= 0);
 
            do {
            	System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            	personData[i][1] = scanner.nextDouble();
            } while (personData[i][1] <= 0);
 
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            weightStatus[i] = personData[i][2] < 18.5 ? "Underweight" : personData[i][2] < 24.9 ? "Normal" : personData[i][2] < 29.9 ? "Overweight" : "Obese";
        }
        System.out.println("Person Data:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + " - Height: " + personData[i][1] + "m, Weight: " + personData[i][0] + "kg, BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
                    	scanner.close();
	}
}
