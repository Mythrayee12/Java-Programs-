import java.util.Scanner;

public class Kmtomiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km;
        System.out.print("Enter distance in kilometers: ");
        km = scanner.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile(s) for the given " + km + " km.");
        scanner.close();
    }
}
