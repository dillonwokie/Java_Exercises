import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = input.nextLine().toLowerCase();
        char[] inStrList = inStr.toCharArray();
        String vowels = "aeiou";

        int numVowels = 0;
        int numDigits = 0;

        for (char ch : inStrList) {
            if (Character.isDigit(ch)) {
                numDigits++;
            }
            if (vowels.indexOf(ch) != -1) {
                numVowels++;
            }
        }
        double vowelPercent = (double) numVowels / inStr.length() * 100;
        double digitsPercent = (double) numDigits / inStr.length() * 100;

        System.out.printf("Number of vowels: %d (%.2f%%) \n", numVowels, vowelPercent);
        System.out.printf("Number of digits: %d (%.2f%%) ", numDigits, digitsPercent);


    }
}