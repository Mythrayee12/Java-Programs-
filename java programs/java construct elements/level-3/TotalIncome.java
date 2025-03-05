import java.util.Scanner;
public class TotalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take salary input from user
        System.out.print("Enter salary in INR: ");
        double salary = scanner.nextDouble();
        
        // Take bonus input from user
        System.out.print("Enter bonus in INR: ");
        double bonus = scanner.nextDouble();
        
        // Calculate total income
        double totalIncome = salary + bonus;
        
        // Display result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome);
        
        scanner.close();
    }
}

