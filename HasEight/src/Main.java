import java.util.Scanner;

public class Main {

    static boolean hasEight(int number) {
        String regex = ".*8.*";
        return String.valueOf(number).matches(regex);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int SENTINEL = -1;
        int number = 0;
        int sum = 0;

        while (number != SENTINEL) {
            System.out.println("Enter a positive integer (or -1 to end): ");
            number = Integer.parseInt(scan.nextLine());

            if (hasEight(number)) {
                sum += number;
            }
        }
        System.out.println("The magic sum is " + sum);
    }
}