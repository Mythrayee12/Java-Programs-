import java.util.Scanner;

public class QuadraticEquationSolver {

    // Method to find roots of the quadratic equation ax^2 + bx + c = 0
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots (delta is negative)
            return new double[0]; // Returning an empty array
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Finding roots
        double[] roots = findRoots(a, b, c);

        // Displaying results
        if (roots.length == 2) {
            System.out.println("The roots of the quadratic equation are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root of the quadratic equation is: " + roots[0]);
        } else {
            System.out.println("No real roots exist for the given equation.");
        }

        scanner.close();
    }
}
