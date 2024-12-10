// Write 3 programs called HillPatternX (X = A, B, C, D) that prompts user for the size (a non-negative integer in int); and prints the pattern as shown:
//
//          #                # # # # # # # # # # #                #                # # # # # # # # # # #
//        # # #                # # # # # # # # #                # # #              # # # # #   # # # # #
//      # # # # #                # # # # # # #                # # # # #            # # # #       # # # #
//    # # # # # # #                # # # # #                # # # # # # #          # # #           # # #
//  # # # # # # # # #                # # #                # # # # # # # # #        # #               # #
//# # # # # # # # # # #                #                # # # # # # # # # # #      #                   #
//         (a)                        (b)                 # # # # # # # # #        # #               # #
//                                                          # # # # # # #          # # #           # # #
//                                                            # # # # #            # # # #       # # # #
//                                                              # # #              # # # # #   # # # # #
//                                                                #                # # # # # # # # # # #
//                                                               (c)                        (d)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int numRows = 6;
        input.close();

        // Pattern A
        System.out.println("Pattern A: ");
        int numRowsA = numRows;
        int numColsA = 2 * numRowsA - 1;
        for (int row = 1; row <= numRowsA; row++) {
            for (int col = 1; col <= numColsA; col++) {
                if ((row >= col - numRowsA + 1) && (row + col >= numRowsA + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Pattern B
        System.out.println("Pattern B: ");
        int numRowsB = numRows;
        int numColsB = 2 * numRowsB - 1;
        for (int row = numRowsB; row >= 1; row--) {
            for (int col = numColsB; col >= 1; col--) {
                if ((row >= col - numRowsB + 1) && (row + col >= numRowsB + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Pattern C
        System.out.println("Pattern C: ");
        int numRowsC = 2 * numRows - 1;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numRowsC; col++) {
                if (row >= col - numRowsB + 1 && row + col >= numRowsB + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = numRows - 1; row >= 1; row--) {
            for (int col = 1; col <= numRowsC; col++) {
                if (row >= col - numRowsB + 1 && row + col >= numRowsB + 1) {
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
        int numRowsD = 2 * numRows - 1;
        for (int row = 1; row <= numRows ; row++) {
            for (int col = 1; col <= numRowsD; col++) {
                if (row >= col - numRowsB + 2 && row + col >= numRowsB + 2) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int row = numRows - 1; row >= 1; row--) {
            for (int col = 1; col <= numRowsD; col++) {
                if (row >= col - numRowsB + 2 && row + col >= numRowsB + 2) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();


    }
}

