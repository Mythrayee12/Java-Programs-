import java.util.Scanner;
// This program takes an integer input and calculates the sum of the first 'n' natural numbers if valid.
class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n > 0) {
            // Compute the sum using the formula: n * (n + 1) / 2
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        scanner.close();
    }
}

