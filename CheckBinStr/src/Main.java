import java.util.Scanner;

public class Main {
    static boolean checkBinary(String inputStr) {
        for (int i = 0; i < inputStr.length(); i++) {
            char inputChar = inputStr.charAt(i);
            if (!(inputChar == '0' || inputChar == '1')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a binary string: ");
        String inputStr = input.nextLine();
        if (checkBinary(inputStr)) {
            System.out.println("\"" + inputStr + "\" is a binary string");
        } else {
            System.out.println("\"" + inputStr + "\" is NOT a binary string");
        }
    }
}