import java.util.Scanner;

public class Main {
    static boolean CheckBinStr(String inputStr) {
        return inputStr.matches("[0-1]+");
    }

    static boolean CheckHexStr(String inputStr) {
        return inputStr.matches("[0-9a-fA-F]+");
    }

    static int BinToDec(String inputStr) {
        int decimalValue = 0;
        int power = 0;

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            // Convert char to integer value
            int digit = inputStr.charAt(i) - '0';

            // Calculate decimal value
            decimalValue += digit * Math.pow(2, power);
            power++;
        }
        return decimalValue;
    }

    static int HexToDec(String inputStr) {
        int decimalValue = 0;
        int power = 0;

        // Convert to uppercase to simplify processing
        inputStr = inputStr.toUpperCase();

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            char currentChar = inputStr.charAt(i);
            int digitValue = 0;

            if (Character.isDigit(currentChar)) {
                digitValue = currentChar - '0';
            } else if (currentChar >= 'A' && currentChar <= 'F') {
                digitValue = currentChar - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid hexadecimal character: " + currentChar);
            }
            // Calculate decimal value
            decimalValue += (digitValue * Math.pow(16, power));
            power++;
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Binary string: ");
        String inputBin = input.nextLine();

        if (CheckBinStr(inputBin)) {
            int decimalResult = BinToDec(inputBin);
            System.out.printf("The equivalent decimal number for binary \"%s\" is: %d\n", inputBin, decimalResult);

        } else {
            System.out.printf("error: invalid binary string \"%s\"\n", inputBin);
        }

        System.out.println("Enter a Hexadecimal string: ");
        String inputHex = input.nextLine();

        if (CheckHexStr(inputHex)) {
            int hexResult = HexToDec(inputHex);
            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d\n", inputHex, hexResult);

        } else {
            System.out.printf("error: invalid hexadecimal string \"%s\"\n", inputHex);
        }

    }
}