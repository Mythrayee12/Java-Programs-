import java.util.Scanner;
// Program 2: Check if the first number is the smallest of three
// This program takes three integer inputs and checks if the first number is the smallest.
class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        // Compare first number with the other two numbers
        System.out.println("Is the first number the smallest? " + (num1 < num2 && num1 < num3));
        scanner.close();
    }
}
