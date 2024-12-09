import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = Integer.parseInt(input.nextLine());

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print("# ");
            }
            System.out.println();
            if (row % 2 == 0) {
                System.out.print(" ");
            }
        }
    }
}