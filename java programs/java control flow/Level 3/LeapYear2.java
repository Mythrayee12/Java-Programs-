import java.util.Scanner; 
public class LeapYear2 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a Year:"); 
        int year = sc.nextInt(); 
        // Single if condition to determine if it is a leap year 
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { 
            System.out.println(year + " is a leap year."); 
        } else { 
            System.out.println(year + " is not a leap year."); 
        } 
        sc.close();  
    } 
 
 
} 
