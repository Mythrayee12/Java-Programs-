import java.util.Scanner;
public class DistributeChocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take inputs for chocolates and children
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();
        
        // Calculate chocolates per child and remainder
        int chocolatesEach = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        
        // Display results
        System.out.println("Each child gets " + chocolatesEach + 
                           " chocolates and the remaining chocolates are " + remainingChocolates);
        
        scanner.close();
    }
}
