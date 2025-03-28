import java.util.Scanner;
class BMI {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of persons: ");
        int persons = scanner.nextInt();
        double[][] personData = new double[persons][3];
        String[] weightStatus = new String[persons];
                    	for (int i = 0; i < persons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (m): ");
            personData[i][1] = scanner.nextDouble();
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25) weightStatus[i] = "Normal";
            else if (personData[i][2] < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i+1) + " Height: " + personData[i][1] + "m, Weight: " + personData[i][0] + "kg, BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
                    	scanner.close();
        	}
}

