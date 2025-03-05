import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("Not a natural number");
        }

        scanner.close();
    }
}

