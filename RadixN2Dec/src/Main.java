import java.util.Scanner;

public class Main {
    static boolean CheckRadixNStr(int radix, String inputStr) {
        // Validate radix range
        if (radix < 2 || radix > 36) {
            return false;
        }

        // Create a regex pattern based on the radix
        String regex;
        if (radix <= 10) {
            // For radix 2-10, match digits from 0 to (radix-1)
            regex = "^[0-" + (radix - 1) + "]+$";
        } else {
            // For radix 11-36, match digits 0-9 and appropriate letters
            regex = "^[0-9A-" + (char)('A' + radix - 11) + "]+$";
        }
        return inputStr.matches(regex);
    }

    static long RadixNToDec(int radix, String inputStr) {
        // Validate radix range
        if (radix < 2 || radix > 36) {
            throw new IllegalArgumentException("Invalid radix: " + radix);
        }

        long decimalValue = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            char currentChar = inputStr.charAt(inputStr.length() - 1 - i);
            int digitValue = Character.digit(currentChar, radix);

            // Validate digit
            if (digitValue == -1) {
                throw new IllegalArgumentException("Invalid character for radix " + radix + ": " + currentChar);
            }

            // Calculate decimal value with long to prevent overflow
            decimalValue += (long)(digitValue * Math.pow(radix, i));
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter the radix: ");
            int radix = Integer.parseInt(input.nextLine());

            System.out.println("Enter the string: ");
            String inputStr = input.nextLine();

            // Convert to uppercase to simplify processing
            inputStr = inputStr.toUpperCase();

            if (CheckRadixNStr(radix, inputStr)) {
                long result = RadixNToDec(radix, inputStr);
                System.out.printf("The equivalent decimal number for Radix %d \"%s\" is: %d\n", radix, inputStr, result);
            } else {
                System.out.printf("Error: Invalid input string \"%s\" for radix %d\n", inputStr, radix);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid radix input. Please enter a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}