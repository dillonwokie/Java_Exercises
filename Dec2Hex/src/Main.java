import java.util.Scanner;

public class Main {
    // Convert decimal to any base (2-36)
    static String decimalToBase(int decimal, int radix) {
        // Handle special case of decimal being 0
        if (decimal == 0) {
            return "0";
        }

        // Handle negative numbers
        boolean isNegative = decimal < 0;
        decimal = Math.abs(decimal);

        StringBuilder result = new StringBuilder();

        // Convert decimal to target base
        while (decimal > 0) {
            int remainder = decimal % radix;
            // Convert remainder to appropriate character
            // For 0-9, adds 48 to get ASCII values ('0' to '9')
            // For 10-35, adds 55 to get ASCII values ('A' to 'Z')
            char digit = (char)(remainder < 10 ?
                    remainder + '0' :
                    remainder - 10 + 'A');
            result.insert(0, digit);
            decimal = decimal / radix;
        }

        // Add negative sign if needed
        return isNegative ? "-" + result : result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a decimal number: ");
            int decimal = scan.nextInt();

            System.out.println("Enter the target radix (2-36): ");
            int radix = scan.nextInt();

            // Validate radix range
            if (radix < 2 || radix > 36) {
                throw new IllegalArgumentException("Radix must be between 2 and 36");
            }

            String result = decimalToBase(decimal, radix);

            // Format output based on radix
            String baseSystem = switch(radix) {
                case 2 -> "binary";
                case 8 -> "octal";
                case 16 -> "hexadecimal";
                default -> "base-" + radix;
            };

            System.out.printf("The %s representation of %d is: %s%n", baseSystem, decimal, result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers");
        }
    }
}