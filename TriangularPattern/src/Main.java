// #                    # # # # # # # #      # # # # # # # #                    #
//# #                  # # # # # # #          # # # # # # #                  # #
//# # #                # # # # # #              # # # # # #                # # #
//# # # #              # # # # #                  # # # # #              # # # #
//# # # # #            # # # #                      # # # #            # # # # #
//# # # # # #          # # #                          # # #          # # # # # #
//# # # # # # #        # #                              # #        # # # # # # #
//# # # # # # # #      #                                  #      # # # # # # # #
//     (a)                   (b)                  (c)                  (d)

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
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Pattern B
        System.out.println("Pattern B: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Pattern C
        System.out.println("Pattern C: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col >= row) {
                    System.out.print("# ");
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
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}