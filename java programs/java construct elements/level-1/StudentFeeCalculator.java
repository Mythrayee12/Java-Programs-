import java.util.Scanner;

public class StudentFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total fee amount (INR): ");
        double fee = scanner.nextDouble();
        
        System.out.print("Enter the discount percentage offered by the university: ");
        double discountPercent = scanner.nextDouble();
        
        double discount = (discountPercent / 100) * fee;
        
        double finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        scanner.close();
    }
}