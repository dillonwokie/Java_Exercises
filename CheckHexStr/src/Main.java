import java.util.Scanner;

public class Main {

    static boolean CheckHexStr(String inputStr) {
        return inputStr.matches("[0-9a-fA-F]+");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex string: ");
        String inputStr = input.nextLine();

        if (CheckHexStr(inputStr)) {
            System.out.printf("\"%s\" is a hex string", inputStr);
        } else {
            System.out.printf("\"%s\" is NOT a hex string", inputStr);
        }

    }
}