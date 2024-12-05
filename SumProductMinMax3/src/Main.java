import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables
        int num1, num2, num3;
        int sum, product, min, max;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st integer:");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter 2nd integer:");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Enter 3rd integer:");
        num3 = Integer.parseInt(input.nextLine());

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(num1,num2,num3));
        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;

        // Compute Smallest Number
        min = num1;
        for (int i = 0; i < numbers.size() ; i++) {
            int number = numbers.get(i);
            if (numbers.get(i) < min){
                min = number;
            }
        }

        // Compute Largest Number
        max = num1;
        for (int i = 0; i < numbers.size() ; i++) {
            int number = numbers.get(i);
            if (numbers.get(i) > max){
                max = number;
            }
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);

    }
}