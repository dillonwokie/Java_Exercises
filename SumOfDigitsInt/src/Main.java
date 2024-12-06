import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int inputNum, digit;
        int sumOfDigits = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        inputNum = Integer.parseInt(input.nextLine());

        while (inputNum > 0) {
            digit = inputNum % 10;
            sumOfDigits += digit;
            inputNum /= 10;
        }

        System.out.println("The sum of all digits is: " + sumOfDigits);
    }
}