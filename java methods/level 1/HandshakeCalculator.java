import java.util.Scanner;

public class HandshakeCalculator {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of handshakes is " + handshakes);
        
        scanner.close();
    }
}
