import java.util.*;
public class LargestTwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10); // Extract last digit
            number /= 10; // Remove last digit
        }
        if (digits.isEmpty()) {
            System.out.println("No digits found.");
            return;
        }
        Collections.sort(digits, Collections.reverseOrder()); // Sort digits in descending order
        int largest = digits.get(0);
        int secondLargest = -1;
        for (int i = 1; i < digits.size(); i++) {
            if (digits.get(i) != largest) { // Find second largest
            	secondLargest = digits.get(i);
            	break;
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest != -1 ? secondLargest : "None"));
                    	scanner.close();
	}
        	
}

