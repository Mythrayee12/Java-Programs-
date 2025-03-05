
import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age and height of Amar: ");
        int age1 = scanner.nextInt();
        int height1 = scanner.nextInt();

        System.out.print("Enter age and height of Akbar: ");
        int age2 = scanner.nextInt();
        int height2 = scanner.nextInt();

        System.out.print("Enter age and height of Anthony: ");
        int age3 = scanner.nextInt();
        int height3 = scanner.nextInt();

        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(height1, Math.max(height2, height3));

        System.out.println("Youngest friend's age: " + youngest);
        System.out.println("Tallest friend's height: " + tallest);

        scanner.close();
    }
}

