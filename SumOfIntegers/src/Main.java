import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter the second integer: ");
        int num2 = Integer.parseInt(input.nextLine());

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);

    }
}