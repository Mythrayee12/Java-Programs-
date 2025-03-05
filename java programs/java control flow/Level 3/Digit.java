import java.util.Scanner; 
public class Digit { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
         
        // Get the integer input from the user 
        System.out.println("Enter an integer:"); 
        int number = sc.nextInt(); 
         
        // Handle negative numbers by taking the absolute value 
        number = Math.abs(number); 
         
 
 
        // Initialize count variable to 0 
        int count = 0; 
        // Use a loop to count the digits 
        while (number != 0) { 
            // Remove the last digit from number 
            number /= 10; // Integer division to discard the last digit 
            // Increase count by 1 
            count++; 
        } 
         
        // Special case for the number 0 
        if (count == 0) { 
            count = 1; // 0 has one digit 
        } 
        // Display the count of digits 
        System.out.println("The number of digits is: " + count); 
         
        sc.close(); // Close the scanner 
    } 
} 

