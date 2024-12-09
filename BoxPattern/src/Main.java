// Write 4 programs called BoxPatternX (X = A, B, C, D) that prompts user for the size (a non-negative integer in int); and prints the pattern as shown:

//# # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #
//#           #      #                        #        #       #      # #       # #
//#           #        #                    #            #   #        #   #   #   #
//#           #          #                #                #          #     #     #
//#           #            #            #                #   #        #   #   #   #
//#           #              #        #                #       #      # #       # #
//# # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #
//     (a)               (b)             (c)              (d)              (e)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = Integer.parseInt(input.nextLine());
        input.close();

        // Pattern A
        System.out.println("Pattern A: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Pattern B
        System.out.println("Pattern B: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Pattern C
        System.out.println("Pattern C: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row + col == size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Pattern D
        System.out.println("Pattern D: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row + col == size + 1 || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Pattern E
        System.out.println("Pattern E: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row + col == size + 1 || row == col || col == size || col == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}