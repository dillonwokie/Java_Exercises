import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inStr;
        int inStrLen;
        StringBuilder revStr = new StringBuilder();


        System.out.println("Enter a string: ");
        inStr = input.nextLine();
        inStrLen = inStr.length();

        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
            revStr.append(inStr.charAt(charIdx));
        }

        System.out.println("The reverse of the String \"" + inStr + "\" is \"" + revStr + "\".");
    }
}