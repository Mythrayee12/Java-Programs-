import java.util.Scanner;
// This program takes an integer input from the user and checks if it is divisible by 5.
class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Check divisibility by 5 using modulus operator
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
        scanner.close();
    }
}
