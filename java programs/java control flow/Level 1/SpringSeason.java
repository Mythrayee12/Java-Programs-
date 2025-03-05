import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        boolean isSpring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");

        scanner.close();
    }
}
