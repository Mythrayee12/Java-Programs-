public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        
        int pensPerStudent = totalPens / students; // Using division operator
        int remainingPens = totalPens % students;  // Using modulus operator
        
        System.out.println("Each student will get: " + pensPerStudent + " pens");
        System.out.println("Remaining pens: " + remainingPens);
    }
}
