import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder binStr = new StringBuilder();
        String[] binBits = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};

        System.out.println("Enter a Hexadecimal string: ");
        String hexStr = scan.nextLine();

        for (int i = 0; i < hexStr.length(); i++) {
            char hexChar = hexStr.charAt(i);
            if (hexChar >= '0' && hexChar <= '9') {
                binStr.append(binBits[hexChar - '0']).append(" ");
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                binStr.append(binBits[hexChar - 'a' + 10]).append(" ");
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                binStr.append(binBits[hexChar - 'A' + 10]).append(" ");
            } else {
                System.out.println("Error: Invalid hex string \"" + hexStr + "\" ");
                return;
            }
        }

        System.out.println("The equivalent binary for hexadecimal \"" + hexStr + "\" is: " + binStr);
    }
}