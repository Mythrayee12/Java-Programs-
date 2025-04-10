import java.util.Scanner;

public class StudentVoteChecker {
    
    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid negative age
        }
        return age >= 18; // Eligible if 18 or above
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10]; // Array to store ages of 10 students

        // Loop to take user input for each student's age
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Checking voting eligibility for each student
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") " +
                    (canVote ? "can vote." : "cannot vote."));
        }

        scanner.close();
    }
}
