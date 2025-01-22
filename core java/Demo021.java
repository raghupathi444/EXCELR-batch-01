import java.util.Scanner;

public class Demo021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlyGrossSalary = getValidInput(scanner, "Enter your monthly gross salary: ");
        double hra = getValidInput(scanner, "Enter your monthly HRA: ");
        double pf = getValidInput(scanner, "Enter your monthly PF: ");
        double annualSalary = monthlyGrossSalary * 12;
        double annualHRA = hra * 12;
        double annualPF = pf * 12;
        double deductions = annualHRA + annualPF;
        double taxableIncome = annualSalary - deductions;
        double tax = calculateTax(taxableIncome);
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Deductions (HRA + PF): " + deductions);
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.printf("Annual Income Tax: %.2f\n", tax); 
    }
    public static double getValidInput(Scanner scanner, String prompt) {
        double input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextDouble();
            if (input >= 0) {
                break;
            } else {
                System.out.println("Please enter a valid positive number.");
            }
        }
        return input;
    }
    public static double calculateTax(double taxableIncome) {
        if (taxableIncome <= 0) {
            return 0;
        } else if (taxableIncome <= 500000) {
            return taxableIncome * 0.1;
        } else if (taxableIncome <= 1000000) {
            return (500000 * 0.1) + (taxableIncome - 500000) * 0.2;
        } else {
            return (500000 * 0.1) + (500000 * 0.2) + (taxableIncome - 1000000) * 0.3;
        }
    }
}
