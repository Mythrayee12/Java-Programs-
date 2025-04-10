import java.util.Scanner;

public class SumNaturalNumbersComparison {
    
    // Recursive method to find the sum of n natural numbers
    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + findSumRecursive(n - 1);
    }

    // Method using formula n*(n+1)/2
    public static int findSumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (greater than 0): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive natural number.");
            scanner.close();
            return;
        }

        int recursiveSum = findSumRecursive(n);
        int formulaSum = findSumFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula n*(n+1)/2: " + formulaSum);
        
        // Comparing both results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result, proving the formula is correct!");
        } else {
            System.out.println("Something went wrong. The results do not match.");
        }
        
        scanner.close();
    }
}


