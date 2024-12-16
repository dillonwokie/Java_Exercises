import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String phrase) {
        phrase = phrase.toLowerCase();
        int fwdIndex = 0, bwdIndex = phrase.length() - 1;

        while (fwdIndex < bwdIndex) {
            // Skip non-alphabetic characters from the front
            while (fwdIndex < bwdIndex && !Character.isAlphabetic(phrase.charAt(fwdIndex))) {
                fwdIndex++;
            }
            // Skip non-alphabetic characters from the back
            while (fwdIndex < bwdIndex && !Character.isAlphabetic(phrase.charAt(bwdIndex))) {
                bwdIndex--;
            }
            // Compare alphabetic characters
            if (phrase.charAt(fwdIndex) != phrase.charAt(bwdIndex)) {
                return false;
            }
            // Move indices
            fwdIndex++;
            bwdIndex--;
        }
        return true;
    }

    public static boolean isPalindromicRegex(String phrase) {
        // Filter out non-alphabetical characters with regex
        String cleanedPhrase = phrase.replaceAll("[^a-zA-Z]", "");

        // Reverse and Compare
        String reversedPhrase = new StringBuilder(cleanedPhrase).reverse().toString();

        return cleanedPhrase.equals(reversedPhrase);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Check with Index Method
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        if (isPalindrome(word)) {
            System.out.println("\"" + word + "\" is a palindrome");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome");
        }

        // Check with Regex Method
        System.out.println("Enter a phrase: ");
        String phrase = input.nextLine();
        if (isPalindromicRegex(phrase)) {
            System.out.println("\"" + phrase + "\" is a palindrome");
        } else {
            System.out.println("\"" + phrase + "\" is not a palindrome");
        }

    }
}