import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = Integer.parseInt(input.nextLine());
        input.close();

        // Print header row
        System.out.print(" * |");
        for (int col = 1; col <= size; ++col) {
            System.out.printf("%4d", col);
        }
        System.out.println();

        // Print separator row
        System.out.print("----");
        for (int col = 0; col < size; col++) {
            System.out.printf("%4s", "----");
        }
        System.out.println();

        // Print body using nested for loop
        for (int row = 1; row <= size; row++) {
            System.out.printf("%2d |", row);
            for (int col = 1; col <= size; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }


    }
}