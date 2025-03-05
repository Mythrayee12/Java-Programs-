import java.util.Scanner; 
public class Grade { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
         
        System.out.println("Enter marks for Physics: "); 
        int physics = sc.nextInt(); 
         
        System.out.println("Enter marks for Chemistry: "); 
        int chemistry = sc.nextInt(); 
         
        System.out.println("Enter marks for Mathematics: "); 
        int mathematics = sc.nextInt(); 
         
        int totalMarks = physics + chemistry + mathematics; 
        double averageMarks = totalMarks / 3.0;  
        double percentage = (totalMarks / 300.0) * 100; 
   
        char grade; 
        String remarks; 
         
        if (averageMarks >= 90) { 
            grade = 'A'; 
            remarks = "Excellent"; 
        } else if (averageMarks >= 80) { 
            grade = 'B'; 
            remarks = "Very Good"; 
        } else if (averageMarks >= 70) { 
 
 
            grade = 'C'; 
            remarks = "Good"; 
        } else if (averageMarks >= 60) { 
            grade = 'D'; 
            remarks = "Average"; 
        } else { 
            grade = 'F'; 
            remarks = "Fail"; 
        } 
         
        System.out.println("\n--- Result ---"); 
        System.out.printf("Total Marks: %d\n", totalMarks); 
        System.out.printf("Average Marks: %.2f\n", averageMarks); 
        System.out.printf("Percentage: %.2f%%\n", percentage); 
        System.out.printf("Grade: %c\n", grade); 
        System.out.println("Remarks: " + remarks); 
         
        sc.close();  
    } 
} 
