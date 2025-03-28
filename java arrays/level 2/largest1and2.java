import java.util.Scanner;
class largest1and2 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number > 0) {
            if (index == maxDigit) {
            	maxDigit += 10;
            	int[] temp = new int[maxDigit];
            	System.arraycopy(digits, 0, temp, 0, index);
            	digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
            	secondLargest = largest;
            	largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
            	secondLargest = digits[i];
            }
        }
        System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
        scanner.close();
}
}
