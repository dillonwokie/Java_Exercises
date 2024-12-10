//1                    1 2 3 4 5 6 7 8                    1      8 7 6 5 4 3 2 1
//1 2                    1 2 3 4 5 6 7                  2 1      7 6 5 4 3 2 1
//1 2 3                    1 2 3 4 5 6                3 2 1      6 5 4 3 2 1
//1 2 3 4                    1 2 3 4 5              4 3 2 1      5 4 3 2 1
//1 2 3 4 5                    1 2 3 4            5 4 3 2 1      4 3 2 1
//1 2 3 4 5 6                    1 2 3          6 5 4 3 2 1      3 2 1
//1 2 3 4 5 6 7                    1 2        7 6 5 4 3 2 1      2 1
//1 2 3 4 5 6 7 8                    1      8 7 6 5 4 3 2 1      1
//     (a)                  (b)                    (c)                (d)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = Integer.parseInt(input.nextLine());

        // Pattern A
        System.out.println("Pattern A: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Pattern B
        System.out.println("Pattern B: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col >= row) {
                    System.out.print(col-row +1 + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Pattern C
        System.out.println("Pattern C: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 8; col >= 1; col--) {
                if (row >= col) {
                    System.out.print(col + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Pattern D
        System.out.println("Pattern D: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 8; col >= 1; col--) {
                if (col >= row) {
                    System.out.print(col-row +1 + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}