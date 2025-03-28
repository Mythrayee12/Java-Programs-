import java.util.Scanner;

public class MeanHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];  // Array for 11 players

        // Input heights for all players
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculate the mean height
        double meanHeight = sum / heights.length;
        System.out.println("The mean height of the football team is: " + meanHeight);

        // Close the scanner
        scanner.close();
    }
}

