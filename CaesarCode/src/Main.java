import java.util.Scanner;

public class Main {
    // Encryption method
    public static String encrypt(String plainText) {
        StringBuilder cipherText = new StringBuilder();
        for (char letter : plainText.toCharArray()) {
            if (Character.isAlphabetic(letter)) {
                // Preserve original case while shifting
                char base = Character.isUpperCase(letter) ? 'A' : 'a';
                char shiftedLetter = (char) (((letter - base + 3) % 26) + base);
                cipherText.append(shiftedLetter);
            } else {
                cipherText.append(letter);
            }
        }
        return cipherText.toString();
    }

    // Decryption method
    public static String decrypt(String cipherText) {
        StringBuilder plainText = new StringBuilder();
        for (char letter : cipherText.toCharArray()) {
            if (Character.isAlphabetic(letter)) {
                // Preserve original case while shifting
                char base = Character.isUpperCase(letter) ? 'X' : 'x';
                char shiftedLetter = (char) (((letter - base - 3) % 26) + base);
                plainText.append(shiftedLetter);
            } else {
                plainText.append(letter);
            }
        }
        return plainText.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Encryption
        System.out.println("Enter a plaintext string to encrypt: ");
        String plainText = input.nextLine();
        String encryptedText = encrypt(plainText);
        System.out.println("Encrypted text: " + encryptedText);

        // Decryption
        System.out.println("Enter a ciphertext string to decrypt: ");
        String cipherText = input.nextLine();
        String decryptedText = decrypt(cipherText);
        System.out.println("Decrypted text: " + decryptedText);
    }
}