import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare constants
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_AND_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_AND_ABOVE = 0.075;

        // Declare variables
        int age, salary, salaryContributable;
        double employeeContribution, employerContribution, totalContribution;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the monthly salary (or -1 to end): $ ");
            salary = Integer.parseInt(input.nextLine());

            if (salary == -1) {
                System.out.println("Bye!");
                break;
            }

            System.out.println("Enter the age: ");
            age = Integer.parseInt(input.nextLine());

            // Check the contribution cap
            salaryContributable = Math.min(salary, SALARY_CEILING);

            // Calculate employee and employer contribution respectively
            if (age <= 55) {
                employeeContribution = salaryContributable * EMPLOYEE_RATE_55_AND_BELOW;
                employerContribution = salaryContributable * EMPLOYER_RATE_55_AND_BELOW;
            } else if (age <= 60) {
                employeeContribution = salaryContributable * EMPLOYEE_RATE_55_TO_60;
                employerContribution = salaryContributable * EMPLOYER_RATE_55_TO_60;
            } else if (age <= 65) {
                employeeContribution = salaryContributable * EMPLOYEE_RATE_60_TO_65;
                employerContribution = salaryContributable * EMPLOYER_RATE_60_TO_65;
            } else {
                employeeContribution = salaryContributable * EMPLOYEE_RATE_65_AND_ABOVE;
                employerContribution = salaryContributable * EMPLOYER_RATE_65_AND_ABOVE;
            }

            totalContribution = employeeContribution + employerContribution;

            System.out.printf("The employee's contribution is: $%.2f\n", employeeContribution);
            System.out.printf("The employer's contribution is: $%.2f\n", employerContribution);
            System.out.printf("The total contribution is: $%.2f\n", totalContribution);
        }
    }
}