import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (or 0 or negative to stop): ");
            double num = scanner.nextDouble();

            if (num <= 0 || index >= 10) {
                break;
            }

            numbers[index++] = num;
        }

        // Calculate the sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the sum
        System.out.println("Total sum of numbers: " + total);

        // Close the scanner
        scanner.close();
    }
}
