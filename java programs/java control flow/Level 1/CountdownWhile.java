import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int counter = scanner.nextInt();

        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");

        scanner.close();
    }
}

