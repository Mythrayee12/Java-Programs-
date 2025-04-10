import java.util.Scanner;

public class NumberCheck {
    public static int checkNumber(int number) {
        return Integer.compare(number, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = checkNumber(number);
        
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
        
        scanner.close();
    }
}

