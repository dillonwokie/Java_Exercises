import java.util.Scanner;

public class Main {

    public static String Encrypt(String plainText) {
        StringBuilder cipherText = new StringBuilder();
        for (char letter : plainText.toCharArray()) {
            if (Character.isAlphabetic(letter)) {
                // Preserve original case while swapping
                char base = Character.isUpperCase(letter) ? 'A' : 'a';
                int index = letter - base;
                char swappedLetter = (char) ((base + (25 - index)));
                cipherText.append(swappedLetter);
            } else {
                cipherText.append(letter);
            }
        }
        return cipherText.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a plaintext string: ");
        String plainText = input.nextLine();
        String encryptedText = Encrypt(plainText);
        System.out.println("The ciphertext string is: " + encryptedText);
    }
}