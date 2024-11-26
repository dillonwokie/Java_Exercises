public class Main {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 110;
        boolean printed;

        cozaLozaWoza(lowerBound,upperBound);
    }

    static void cozaLozaWoza (int lower, int upper){
        boolean printed = false;
        for (int i = lower; i <= upper; i++) {
            printed = false;

            if (i % 3 == 0) {
                System.out.print("Coza");
                printed = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                printed = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                printed = true;
            }
            if (!printed) {
                System.out.print(i);
            }

            // Print new line if number is divisible by 11
            if (i % 11 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }

}