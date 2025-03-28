import java.util.Scanner;
class Bonus {
public static void main (String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	    	int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        int[] yearsOfService = new int[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
 
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salaries[i] = scanner.nextDouble();
            System.out.print("Enter years of service: ");
            yearsOfService[i] = scanner.nextInt();
            if (salaries[i] < 0 || yearsOfService[i] < 0) {
            	i--;
            	continue;
            }
        }
 
        for (int i = 0; i < numEmployees; i++) {
            bonuses[i] = salaries[i] * (yearsOfService[i] > 5 ? 0.05 : 0.02);
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
 
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
                    	scanner.close();
	}
}

