//For example, suppose that the taxable income is $85000, the income tax payable is $20000*0% + $20000*10% + $20000*20% + $25000*30%.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        int taxableIncome;
        double taxPayable;
        double taxPayableWithRebate;
        double taxRebate;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the taxable income (or -1 to end): $");
            taxableIncome = Integer.parseInt(input.nextLine());

            // Check if sentinel value -1 is entered
            if (taxableIncome == -1) {
                System.out.println("Bye!");
                break;
            }

            // Compute tax payable
            if (taxableIncome <= 20000) {
                taxPayable = 0;
            } else if (taxableIncome <= 40000) {
                taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
            } else if (taxableIncome <= 60000) {
                taxPayable = 20000 * TAX_RATE_ABOVE_20K + (taxableIncome - 40000) * TAX_RATE_ABOVE_40K;
            } else {
                taxPayable = 20000 * TAX_RATE_ABOVE_20K + 20000 * TAX_RATE_ABOVE_40K + (taxableIncome - 60000) * TAX_RATE_ABOVE_60K;
            }

            // Compute tax rebate
            if (taxPayable < 10000) {
                taxRebate = 0.1 * taxPayable;
            } else {
                taxRebate = 1000;
            }
            System.out.printf("Tax rebate: $%.2f%n", taxRebate);

            // Compute tax payable with rebate
            taxPayableWithRebate = taxPayable - taxRebate;

            System.out.printf("The income tax payable is $%.2f%n", taxPayableWithRebate);
        }

    }
}