import java.util.Scanner;

// This program takes an integer input (age) and determines if the person is eligible to vote.
class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        // Check if age is 18 or greater
        System.out.println("The person's age is " + age + " and " + (age >= 18 ? "can vote." : "cannot vote."));
        scanner.close();
    }
}
