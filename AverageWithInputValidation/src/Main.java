import org.w3c.dom.ranges.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        final int NUM_STUDENTS = 3;
        int inputNum;
        int sum = 0;
        double average = 0;
        boolean isValid;

        for (int i = 1; i <= NUM_STUDENTS; i++) {
            System.out.println("Enter the mark (0-100) for student " + i + ":");
            isValid = false; // Reset assuming input is not valid
            do {
                inputNum = Integer.valueOf(input.nextLine());
                if (inputNum >= 0 && inputNum <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);

            sum += inputNum;
            average = (double) sum / NUM_STUDENTS;

        }
        System.out.printf("The average is %.2f\n", average);
    }
}