import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial: " + fact);
        scanner.close();
    }
}
