import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double val = scanner.nextDouble();
            if (val == 0) break;
            total += val;
        }
        System.out.println("Total sum: " + total);
        scanner.close();
    }
}

