import java.util.Scanner; 
public class HarshadNumber{ 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        System.out.print("Enter an integer: "); 
        int number = scanner.nextInt(); 
         
        int sumOfDigits = 0; 
        int originalNumber = number;  
        while (number > 0) { 
            int digit = number % 10;  
            sumOfDigits += digit;  
            number /= 10;  
        } 
 
 
        if (originalNumber % sumOfDigits == 0) { 
            System.out.println("Harshad Number"); 
        } else { 
            System.out.println("Not a Harshad Number"); 
        } 
        scanner.close();  
    } 
} 
